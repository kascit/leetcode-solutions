/*
 * Submission: 1834111167
 * Problem: Second Largest Digit in a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:14:57 UTC
 * Runtime: 1 ms
 * Memory: 43.4 MB
 */

class Solution {
    public int secondHighest(String s) {
        int max = -1, smax= -1;
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - '0';
            if ( cur >= 0 && cur <= 9) {
                if (cur > max) {
                    smax= max;
                    max = cur;
                } else if ( cur < max && cur > smax) {
                    smax = cur;
                }
            }
        } return smax;
    }
}