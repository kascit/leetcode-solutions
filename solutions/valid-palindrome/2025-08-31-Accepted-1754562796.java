/*
 * Submission: 1754562796
 * Problem: Valid Palindrome (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 09:08:17 UTC
 * Runtime: 2 ms
 * Memory: 43 MB
 */

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        
        while(start < end){
            char a = s.charAt(start);
            char b = s.charAt(end);

            if(!Character.isLetterOrDigit(a)){
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(b)){
                end--;
                continue;
            }

            if(!isEqual(a, b)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public boolean isEqual(char a, char b){
        if(a == b) return true;

        if(a >= 'a' && a <= 'z'){
            a = (char) (a - 'a' + 'A');
        }

        if(b >= 'a' && b <= 'z'){
            b = (char) (b - 'a' + 'A');
        }

        return a == b;
    }
}