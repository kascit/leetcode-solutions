/*
 * Submission: 1745014850
 * Problem: Find Valid Matrix Given Row and Column Sums (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-23 05:31:50 UTC
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
                    int diff = colSum[j] - colwa[j];
                    if (i < j && j < rows) diff = 0;
                    // System.out.println(i+"=i   "+j+"=j   ");
                    // System.out.println(rowSum[i]+"-"+min+"      "+colSum[j]+"-"+colwa[j]);
                    ans[i][j] = Math.min(
                        rowSum[i] - min,
                        diff
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

14   6  0  8
9    0  9  0

     6  9  8


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