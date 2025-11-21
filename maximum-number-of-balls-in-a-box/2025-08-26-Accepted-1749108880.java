/*
 * Submission: 1749108880
 * Problem: Maximum Number of Balls in a Box (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 14:37:38 UTC
 * Runtime: 13 ms
 * Memory: 40.2 MB
 */

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] freq = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int cur = 0;
            int t = i;
            while(t>0){
                cur+=t%10;
                t/=10;
            }
            freq[cur]++;
            max = Math.max(max,freq[cur]);
        } return max;
    }
}