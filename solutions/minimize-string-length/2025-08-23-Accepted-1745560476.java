/*
 * Submission: 1745560476
 * Problem: Minimize String Length (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:51:20 UTC
 * Runtime: 3 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int minimizedStringLength(String s) {
        int[] uniq = new int[26];
        for (char ch : s.toCharArray()) {
            uniq[ch-'a']++;
        }
        int ans = 0;
        for (int n : uniq) {
            if (n > 0) ans++;
        } return ans;
    }
}