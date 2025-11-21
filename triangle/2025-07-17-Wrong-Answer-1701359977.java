/*
 * Submission: 1701359977
 * Problem: Triangle (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-17 14:13:14 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][2];
        for (int i = 0; i < dp.length ; i++) {
            dp[i][0] = 100000;
        }
        int row = 0;
        boolean flag = false;
        for (List<Integer> listy : triangle){
            int col = 0;
            flag = false;
            for (Integer i : listy){
                if (!flag){
                    if ( row == 0 ){
                        dp[col][0] = i;
                    }
                    else {
                        if (col == 0){
                            dp[col][0] = i + dp[col][1]; 
                        }
                        else {
                            dp[col][0] = i + Math.min(dp[col][1],dp[col-1][1]);
                        }
                    }
                    flag = true;
                }
                else {
                    if (col == 0){
                        dp[col][1] = i + dp[col][0]; 
                    }
                    else {
                        dp[col][1] = i + Math.min(dp[col][0],dp[col-1][0]);
                    }
                    flag = false;
                }
                col++;
            }
            row++;
            //System.out.println(row + " " + Arrays.deepToString(dp));

        }

        // return Arrays.stream(dp)          
        //              .flatMapToInt(Arrays::stream) 
        //              .min()
        //              .orElseThrow();
        return (!flag) ? dp[triangle.size()-1][1] : dp[triangle.size()-1][0];
    }
}