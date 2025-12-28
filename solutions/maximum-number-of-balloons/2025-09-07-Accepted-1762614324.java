/*
 * Submission: 1762614324
 * Problem: Maximum Number of Balloons (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 12:00:26 UTC
 * Runtime: 2 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq= new int[26];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)-'a']++;
        }
        return Math.min(
                freq[0],
                Math.min(
                    freq[1],
                    Math.min(
                        freq[11]/2,
                        Math.min(
                            freq[13],
                            freq[14]/2
                        )
                    )
                )
            );
    }
}