/*
 * Submission: 1725200917
 * Problem: Queries on Number of Points Inside a Circle (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 05:08:15 UTC
 * Runtime: 37 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int point = points.length, q = queries.length;
        int[] ans = new int[q];
        for (int i = 0; i < q; i++){
            int cur = 0;
            for(int j = 0; j < point; j++){
                if(
                        Math.pow((points[j][0] - queries[i][0]),2)
                         + 
                         Math.pow((points[j][1] - queries[i][1]),2)
                          <= queries[i][2]*queries[i][2]
                ){
                    cur++;
                }
            }
            ans[i] = cur;
        } return ans;
    }
}