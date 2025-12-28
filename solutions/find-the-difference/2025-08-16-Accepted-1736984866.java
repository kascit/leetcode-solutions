/*
 * Submission: 1736984866
 * Problem: Find the Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:41:42 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    public char findTheDifference(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }
        int ans = 0;
        for (char ch : s.toCharArray()){
            ans ^= ch;
        }
        for (char ch : t.toCharArray()){
            ans ^= ch;
        }
        return (char)ans;
    }
}