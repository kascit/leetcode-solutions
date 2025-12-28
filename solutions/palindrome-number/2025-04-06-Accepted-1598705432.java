/*
 * Submission: 1598705432
 * Problem: Palindrome Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:31:52 UTC
 * Runtime: 6 ms
 * Memory: 44.6 MB
 */

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
    }
}