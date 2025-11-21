/*
 * Submission: 1733937040
 * Problem: Height Checker (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 16:02:43 UTC
 * Runtime: 2 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int heightChecker(int[] heights) {
        int[] TEMP = heights.clone();
        Arrays.sort(TEMP);
        int cnt = 0;
        for (int i = 0; i < TEMP.length; i++){
            if (TEMP[i] != heights[i]) cnt++;
        } return cnt;
    }
}