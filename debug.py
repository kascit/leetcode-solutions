#!/usr/bin/env python3
"""
test_leetcode_api.py - Debug & Test Script for LeetCode API

Tests each component separately to identify issues:
1. Authentication
2. Problem fetching
3. Submission listing
4. Code retrieval
"""

import os
import sys
import json
import time
from datetime import datetime, timezone
import requests
from typing import Dict, Optional

class Colors:
    GREEN = '\033[92m'
    RED = '\033[91m'
    YELLOW = '\033[93m'
    BLUE = '\033[94m'
    END = '\033[0m'
    BOLD = '\033[1m'

def print_test(name: str):
    print(f"\n{Colors.BOLD}🧪 TEST: {name}{Colors.END}")
    print("─" * 60)

def print_success(msg: str):
    print(f"{Colors.GREEN}✓{Colors.END} {msg}")

def print_error(msg: str):
    print(f"{Colors.RED}✗{Colors.END} {msg}")

def print_info(msg: str):
    print(f"{Colors.BLUE}ℹ{Colors.END} {msg}")

def print_warning(msg: str):
    print(f"{Colors.YELLOW}⚠{Colors.END} {msg}")

class LeetCodeTester:
    def __init__(self, session_cookie: str, csrf_token: str = ""):
        self.session_cookie = session_cookie
        self.csrf_token = csrf_token
        self.base_url = "https://leetcode.com/graphql"
        self.session = self._setup_session()
        self.test_results = []
    
    def _setup_session(self) -> requests.Session:
        s = requests.Session()
        s.cookies.update({"LEETCODE_SESSION": self.session_cookie})
        
        if self.csrf_token:
            s.cookies.update({"csrftoken": self.csrf_token})
            s.headers.update({"x-csrftoken": self.csrf_token})
        
        s.headers.update({
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36",
            "Referer": "https://leetcode.com",
            "Origin": "https://leetcode.com",
            "Content-Type": "application/json",
        })
        return s
    
    def _graphql_request(self, query: str, variables: Optional[Dict] = None, timeout: int = 10) -> Dict:
        """Make a GraphQL request"""
        payload = {"query": query}
        if variables:
            payload["variables"] = variables
        
        try:
            response = self.session.post(self.base_url, json=payload, timeout=timeout)
            
            return {
                "status_code": response.status_code,
                "ok": response.status_code == 200,
                "json": response.json() if response.status_code == 200 else None,
                "text": response.text[:200] if response.status_code != 200 else None
            }
        except requests.Timeout:
            return {"error": "timeout", "ok": False}
        except Exception as e:
            return {"error": str(e), "ok": False}
    
    def test_1_csrf_token(self) -> bool:
        """Test 1: CSRF Token Retrieval"""
        print_test("CSRF Token Retrieval")
        
        try:
            response = self.session.get("https://leetcode.com", timeout=10)
            
            if response.status_code != 200:
                print_error(f"Failed to reach LeetCode (Status: {response.status_code})")
                return False
            
            csrf_found = False
            for cookie in self.session.cookies:
                if cookie.name == 'csrftoken':
                    csrf_found = True
                    self.csrf_token = cookie.value
                    self.session.headers.update({"x-csrftoken": cookie.value})
                    print_success(f"CSRF token retrieved: {cookie.value[:20]}...")
                    break
            
            if not csrf_found:
                print_warning("No CSRF token found (might not be required)")
                return True  # Not a failure
            
            return True
            
        except Exception as e:
            print_error(f"Failed: {e}")
            return False
    
    def test_2_authentication(self) -> bool:
        """Test 2: Authentication Check"""
        print_test("Authentication")
        
        query = """
        query globalData {
          userStatus {
            username
            isSignedIn
            isPremium
          }
        }
        """
        
        result = self._graphql_request(query)
        
        if not result.get("ok"):
            print_error(f"Request failed: {result.get('error', result.get('status_code'))}")
            if result.get("text"):
                print_info(f"Response: {result['text']}")
            return False
        
        data = result["json"]
        
        if "errors" in data:
            print_error(f"GraphQL errors: {json.dumps(data['errors'], indent=2)}")
            return False
        
        user_status = data.get("data", {}).get("userStatus", {})
        
        if not user_status:
            print_error("No user status returned - authentication may have failed")
            return False
        
        username = user_status.get("username")
        is_signed_in = user_status.get("isSignedIn")
        is_premium = user_status.get("isPremium")
        
        if is_signed_in:
            print_success(f"Authenticated as: {username}")
            print_info(f"Premium: {is_premium}")
            return True
        else:
            print_error("Not signed in - check your LEETCODE_SESSION cookie")
            return False
    
    def test_3_fetch_problems(self) -> bool:
        """Test 3: Fetch Problem List"""
        print_test("Fetch Problem List")
        
        query = """
        query problemsetQuestionList($categorySlug: String, $limit: Int, $skip: Int, $filters: QuestionListFilterInput) {
          problemsetQuestionList: questionList(
            categorySlug: $categorySlug
            limit: $limit
            skip: $skip
            filters: $filters
          ) {
            total: totalNum
            questions: data {
              difficulty
              frontendQuestionId: questionFrontendId
              status
              title
              titleSlug
            }
          }
        }
        """
        
        variables = {
            "categorySlug": "",
            "skip": 0,
            "limit": 5,
            "filters": {"status": "AC"}
        }
        
        result = self._graphql_request(query, variables)
        
        if not result.get("ok"):
            print_error(f"Request failed: {result.get('error', result.get('status_code'))}")
            return False
        
        data = result["json"]
        
        if "errors" in data:
            print_error(f"GraphQL errors: {json.dumps(data['errors'], indent=2)}")
            return False
        
        problem_list = data.get("data", {}).get("problemsetQuestionList", {})
        total = problem_list.get("total", 0)
        questions = problem_list.get("questions", [])
        
        if not questions:
            print_warning("No problems found - you may not have solved any problems yet")
            return True
        
        print_success(f"Found {total} total problems, fetched {len(questions)}")
        print_info("Sample problems:")
        for q in questions[:3]:
            print(f"  • {q['frontendQuestionId']}. {q['title']} ({q['difficulty']})")
        
        return True
    
    def test_4_fetch_submissions(self, problem_slug: str = None) -> bool:
        """Test 4: Fetch Submissions for a Problem"""
        print_test("Fetch Submissions")
        
        # First, get a problem to test with
        if not problem_slug:
            print_info("Finding a solved problem to test with...")
            query_problems = """
            query problemsetQuestionList($categorySlug: String, $limit: Int, $skip: Int, $filters: QuestionListFilterInput) {
              problemsetQuestionList: questionList(
                categorySlug: $categorySlug
                limit: $limit
                skip: $skip
                filters: $filters
              ) {
                questions: data {
                  titleSlug
                  title
                }
              }
            }
            """
            
            result = self._graphql_request(query_problems, {
                "categorySlug": "",
                "skip": 0,
                "limit": 1,
                "filters": {"status": "AC"}
            })
            
            if not result.get("ok") or "errors" in result.get("json", {}):
                print_error("Could not fetch problems to test submissions")
                return False
            
            questions = result["json"].get("data", {}).get("problemsetQuestionList", {}).get("questions", [])
            if not questions:
                print_warning("No solved problems found - cannot test submission fetching")
                return True
            
            problem_slug = questions[0]["titleSlug"]
            print_info(f"Testing with problem: {questions[0]['title']}")
        
        # Now fetch submissions
        query = """
        query submissionList($questionSlug: String!, $offset: Int!, $limit: Int!) {
          submissionList(
            questionSlug: $questionSlug,
            offset: $offset,
            limit: $limit
          ) {
            hasNext
            submissions {
              id
              statusDisplay
              lang
              runtime
              memory
              timestamp
            }
          }
        }
        """
        
        variables = {
            "questionSlug": problem_slug,
            "offset": 0,
            "limit": 5
        }
        
        result = self._graphql_request(query, variables, timeout=15)
        
        if not result.get("ok"):
            print_error(f"Request failed: {result.get('error', result.get('status_code'))}")
            return False
        
        data = result["json"]
        
        if "errors" in data:
            print_error(f"GraphQL errors: {json.dumps(data['errors'], indent=2)}")
            return False
        
        submission_list = data.get("data", {}).get("submissionList", {})
        submissions = submission_list.get("submissions", [])
        
        if not submissions:
            print_warning("No submissions found for this problem")
            return True
        
        print_success(f"Found {len(submissions)} submissions")
        print_info("Sample submissions:")
        for sub in submissions[:3]:
            ts = datetime.fromtimestamp(int(sub['timestamp']), tz=timezone.utc).strftime("%Y-%m-%d")
            print(f"  • ID {sub['id']}: {sub['statusDisplay']} ({sub['lang']}) - {ts}")
        
        # Store first submission ID for next test
        self.test_submission_id = submissions[0]['id']
        
        return True
    
    def test_5_fetch_code(self) -> bool:
        """Test 5: Fetch Submission Code (Updated Query)"""
        print_test("Fetch Submission Code")
        
        if not hasattr(self, 'test_submission_id'):
            print_warning("Skipping - no submission ID from previous test")
            return True
        
        # --- EDITED QUERY TO FIX 400 ERROR ---
        # The original query was likely requesting fields (like statusDisplay or lang as scalar)
        # that are not available or are formatted differently in the submissionDetails object.
        query = """
        query submissionDetails($submissionId: Int!) {
          submissionDetails(submissionId: $submissionId) {
            code
            runtime
            memory
            lang {
              name
            }
          }
        }
        """
        
        variables = {"submissionId": int(self.test_submission_id)}
        
        result = self._graphql_request(query, variables, timeout=15)
        
        if not result.get("ok"):
            print_error(f"Request failed: {result.get('error', result.get('status_code'))}")
            return False
        
        data = result["json"]
        
        if "errors" in data:
            print_error(f"GraphQL errors: {json.dumps(data['errors'], indent=2)}")
            return False
        
        details = data.get("data", {}).get("submissionDetails", {})
        code = details.get("code")
        
        if not code:
            print_error("No code returned")
            return False
        
        print_success(f"Successfully fetched code for submission {self.test_submission_id}")
        
        # --- EDITED PRINT STATEMENTS ---
        lang_data = details.get('lang', {})
        lang_name = lang_data.get('name', 'Unknown')
        
        print_info(f"Language: {lang_name}")
        # Removed statusDisplay print as it was removed from the query
        print_info(f"Code length: {len(code)} characters")
        print_info(f"First 100 chars: {code[:100]}...")
        
        return True
    
    def test_6_rate_limiting(self) -> bool:
        """Test 6: Rate Limiting Behavior"""
        print_test("Rate Limiting")
        
        print_info("Making 10 rapid requests to test rate limiting...")
        
        query = """
        query {
          userStatus {
            username
          }
        }
        """
        
        success_count = 0
        rate_limited = False
        
        for i in range(10):
            result = self._graphql_request(query, timeout=5)
            
            if result.get("ok"):
                success_count += 1
            elif result.get("status_code") in (403, 429):
                rate_limited = True
                print_warning(f"Rate limited at request {i+1}")
                break
            
            print(f"  Request {i+1}: {'✓' if result.get('ok') else '✗'}", end='\r')
            time.sleep(0.1)
        
        print()  # New line
        
        if rate_limited:
            print_warning(f"Rate limiting triggered after {success_count} requests")
            print_info("This is expected behavior - the script will handle this")
        else:
            print_success(f"All {success_count} requests succeeded")
            print_info("No rate limiting detected in this test")
        
        return True
    
    def run_all_tests(self):
        """Run all tests"""
        print("\n" + "=" * 60)
        print(f"{Colors.BOLD}🔬 LeetCode API Diagnostic Tool{Colors.END}")
        print("=" * 60)
        
        tests = [
            ("CSRF Token", self.test_1_csrf_token),
            ("Authentication", self.test_2_authentication),
            ("Problem Fetching", self.test_3_fetch_problems),
            ("Submission Listing", self.test_4_fetch_submissions),
            ("Code Retrieval", self.test_5_fetch_code),
            ("Rate Limiting", self.test_6_rate_limiting),
        ]
        
        results = []
        
        for name, test_func in tests:
            try:
                passed = test_func()
                results.append((name, passed))
            except Exception as e:
                print_error(f"Test crashed: {e}")
                results.append((name, False))
            
            time.sleep(1)  # Delay between tests
        
        # Print summary
        print("\n" + "=" * 60)
        print(f"{Colors.BOLD}📊 TEST SUMMARY{Colors.END}")
        print("=" * 60)
        
        passed = sum(1 for _, result in results if result)
        total = len(results)
        
        for name, result in results:
            status = f"{Colors.GREEN}PASS{Colors.END}" if result else f"{Colors.RED}FAIL{Colors.END}"
            print(f"  {status} - {name}")
        
        print("\n" + "─" * 60)
        print(f"  {passed}/{total} tests passed")
        
        if passed == total:
            print(f"\n{Colors.GREEN}{Colors.BOLD}✓ All tests passed! Your setup is ready.{Colors.END}")
        elif passed >= total - 1:
            print(f"\n{Colors.YELLOW}⚠ Minor issues detected, but sync should work.{Colors.END}")
        else:
            print(f"\n{Colors.RED}✗ Multiple failures - check your configuration.{Colors.END}")
        
        print("=" * 60)

def main():
    session_cookie = os.getenv("LEETCODE_SESSION", "")
    csrf_token = os.getenv("CSRF_TOKEN", "")
    
    if not session_cookie:
        print(f"\n{Colors.RED}❌ ERROR: LEETCODE_SESSION cookie required{Colors.END}")
        print("\nHow to get your session cookie:")
        print("  1. Login to LeetCode")
        print("  2. Open browser DevTools (F12)")
        print("  3. Go to Network tab")
        print("  4. Refresh the page")
        print("  5. Click any request to leetcode.com")
        print("  6. Find 'cookie' in Request Headers")
        print("  7. Copy the value of 'LEETCODE_SESSION'")
        print("\nThen run:")
        print("  export LEETCODE_SESSION='your_cookie_value'")
        print("  python test_leetcode_api.py")
        sys.exit(1)
    
    print(f"\n{Colors.BLUE}Using session cookie: {session_cookie[:20]}...{Colors.END}")
    if csrf_token:
        print(f"{Colors.BLUE}Using CSRF token: {csrf_token[:20]}...{Colors.END}")
    
    tester = LeetCodeTester(session_cookie, csrf_token)
    tester.run_all_tests()

if __name__ == "__main__":
    main()