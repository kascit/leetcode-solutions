/*
 * Submission: 1745008430
 * Problem: Find Valid Matrix Given Row and Column Sums (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-23 05:24:01 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[][] ans = new int[rows][cols];
        int[] colwa = new int[cols];
        for (int i = 0; i < rows; i++) {
            int cur = 0;
            int min = -1;
            for (int j = 0; j < cols; j++) {
                if(min == -1) min = Math.min(rowSum[i],colSum[i]);
                if (i == j) {
                    ans[i][j] = min;
                }
                else {
                    if (cur == rowSum[i]) break;

                    // System.out.println(i+"=i   "+j+"=j   ");
                    // System.out.println(rowSum[i]+"-"+min+"      "+colSum[j]+"-"+prev);
                    ans[i][j] = Math.min(
                        rowSum[i] - min,
                        colSum[j] - colwa[j]
                    );
                }
                colwa[j] += ans[i][j];
                cur += ans[i][j];
            }
        }
        return ans;
    }
}
/*

3   3 0
8   1 7

    4 7



5    5  0  0
7    1  6  0
10   2  0  8

     8  6  8


*/
        // while (i < rows && j < cols){
        //     int min = Math.min(rowSum[i] ,colSum[j]);
        //     ans[i][j] = min;
        //     i++;
        //     if (i >= rows) break;
            
        //     j++;
        //     if (j >= cols) break;
        //     min = Math.min(rowSum[i],colSum[j]);
        //     ans[i][j] = min;
        // } 