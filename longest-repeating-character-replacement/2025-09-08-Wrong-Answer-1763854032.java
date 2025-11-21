/*
 * Submission: 1763854032
 * Problem: Longest Repeating Character Replacement (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-08 14:18:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int l = 0, max = 0, len = arr.length;
        while (l < len) {
            int r = l;
            int others = 0;
            char cur = arr[l];
            while (r < len && others <= k) {
                if (arr[r] != cur) {
                    others++;
                }
                r++;
            }
            // System.out.println(others);
            if (others > k) r--;
            // System.out.println(l+"   "+r);
            max = Math.max(max,r-l);
            while (l < len && arr[l] == cur) {
                l++;
            }
        } return max;
    }
}