/*
 * Submission: 1782440831
 * Problem: Triangle (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-25 15:42:57 UTC
 * Runtime: 5 ms
 * Memory: 45.2 MB
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
            for (Integer i : listy){
                //System.out.println("cur i: "+i + "col: " + col + );
                if (!flag){
                    if ( row == 0 ){
                        dp[col][0] = i;
                    }
                    else {
                        if (col == 0){
                            dp[col][0] = i + dp[col][1]; 
                        }
                        else if (col == row){
                            dp[col][0] = i + dp[col-1][1]; 
                        }
                        else {
                            dp[col][0] = i + Math.min(dp[col][1],dp[col-1][1]);
                        }
                    }
                }
                else {
                    if (col == 0){
                        dp[col][1] = i + dp[col][0]; 
                    }
                    else if (col == row){
                        dp[col][1] = i + dp[col-1][0]; 
                    }
                    else {
                        dp[col][1] = i + Math.min(dp[col][0],dp[col-1][0]);
                    }
                }
                col++;
            }
            flag = !flag;
            row++;
            //System.out.println(row + " " + Arrays.deepToString(dp));

        }

        
        return (!flag) ? 
                    Arrays.stream(dp)
                    .mapToInt(roww -> roww[1])
                    .min()
                    .getAsInt() 
                    : 
                    Arrays.stream(dp)
                    .mapToInt(roww -> roww[0])
                    .min()
                    .getAsInt() 
                    ;
    }
}