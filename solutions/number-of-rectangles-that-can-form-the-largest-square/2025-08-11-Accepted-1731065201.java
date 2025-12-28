/*
 * Submission: 1731065201
 * Problem: Number Of Rectangles That Can Form The Largest Square (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 09:57:01 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int max = 0;
        for (int[] rectangle : rectangles){
            int cur = Math.min(rectangle[0],rectangle[1]);
            if (cur == max) count++;
            else if(cur > max) {max = cur; count = 1;}
        } return count;
    }
}