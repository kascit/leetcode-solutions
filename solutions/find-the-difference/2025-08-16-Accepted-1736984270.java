/*
 * Submission: 1736984270
 * Problem: Find the Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:41:03 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public char findTheDifference(String s, String t) {
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