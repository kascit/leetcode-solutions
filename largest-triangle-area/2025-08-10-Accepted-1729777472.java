/*
 * Submission: 1729777472
 * Problem: Largest Triangle Area (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 06:26:59 UTC
 * Runtime: 9 ms
 * Memory: 41.7 MB
 */

class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        int len = points.length;
        for (int i = 0; i <len - 2; i++){
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++)
                    ans = Math.max(
                        ans,Math.abs(
                            (double)points[i][0]*(points[j][1]-points[k][1]) + 
                            points[j][0]*(points[k][1]-points[i][1]) + 
                            points[k][0]*(points[i][1]-points[j][1]) 
                            )
                            /2
                        );
        } return ans;
    }
}