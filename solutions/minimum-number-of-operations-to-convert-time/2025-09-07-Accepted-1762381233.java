/*
 * Submission: 1762381233
 * Problem: Minimum Number of Operations to Convert Time (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:19:50 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int convertTime(String current, String correct) {
        int h1 = Integer.parseInt(current.substring(0,2));
        int m1 = Integer.parseInt(current.substring(3,5));
        int h2 = Integer.parseInt(correct.substring(0,2));
        int m2 = Integer.parseInt(correct.substring(3,5));
        int diff = (h2-h1)*60+(m2-m1);
        int ans = 0;
        while (diff > 0) {
            if (diff >= 60) {
                diff-=60;
            } else if (diff >= 15) {
                diff-=15;
            } else if (diff >= 5) {
                diff-=5;
            } else diff--;
            ans++;
        }
        // System.out.println(diff);
        return ans;
    }
}