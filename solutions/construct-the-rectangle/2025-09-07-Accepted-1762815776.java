/*
 * Submission: 1762815776
 * Problem: Construct the Rectangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 15:39:44 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
 */

class Solution {
    public int[] constructRectangle(int area) {
        int width=(int)Math.sqrt(area);     
        while(area%width!=0){
            width--;
        }
        int length=area/width;
        return new int []{length,width};
    }
}