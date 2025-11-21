/*
 * Submission: 1763858454
 * Problem: Longest Repeating Character Replacement (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 14:22:28 UTC
 * Runtime: 8 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
