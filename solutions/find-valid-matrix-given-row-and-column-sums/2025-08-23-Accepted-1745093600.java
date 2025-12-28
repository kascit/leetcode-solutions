/*
 * Submission: 1745093600
 * Problem: Find Valid Matrix Given Row and Column Sums (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 06:58:20 UTC
 * Runtime: 9 ms
 * Memory: 53.1 MB
 */

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[] rowDone = new int[rows];
        int[] colDone = new int[cols];
        int[][] ans = new int[rows][cols];
        boolean[][] cant = new boolean[rows][cols];
        int min = (rows < cols) ? rows : cols;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (i == j) {
                    ans[i][j] = Math.min(rowSum[i],colSum[j]);
                }
                rowDone[i] += ans[i][j];
                colDone[j] += ans[i][j];
            }
        }

        for (int i = 0; i < min; i++) {
            boolean doR = false, doC = false;
            if (rowSum[i] == colSum[i]) {
                doR = true;
                doC = true;
            } else if (rowSum[i] < colSum[i]) {
                doR = true;
            } else
                doC = true;

            if (doC) {
                for (int j = 0; j < rows; j++) {
                    cant[j][i] = true;
                }
            }
            if (doR) {
                for (int j = 0; j < cols; j++) {
                    cant[i][j] = true;
                }
            }
        }
        // for (int i = 0; i < cant.length; i++) {
        //     for (int j = 0; j < cant[i].length; j++) {
        //         System.out.print(cant[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                if(cant[i][j]) continue;
        //         System.out.println(
        //     "i=" + i + ", j=" + j +
        //     " | rowSum[i]-rowDone[i]=" + (rowSum[i] - rowDone[i]) +
        //     " | colSum[j]-colDone[j]=" + (colSum[j] - colDone[j]) +
        //     " | ans[i][j]=" + ans[i][j]
        // );
                ans[i][j] = Math.min(
                    rowSum[i] - rowDone[i],
                    colSum[j] - colDone[j]
                );
                rowDone[i] += ans[i][j];
                colDone[j] += ans[i][j];
            }
        }
        // for (int i = 0; i < ans.length; i++) {
        //     for (int j = 0; j < ans[i].length; j++) {
        //         System.out.print(ans[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        return ans;
    }
}
//     int[] colwa = new int[cols];
//     for (int i = 0; i < rows; i++) {
//         int cur = 0;
//         int min = -1;
//         for (int j = 0; j < cols; j++) {
//             System.out.println(i+"   "+j);
//             if(min == -1) {
//                 min = Math.min(getOrDefault(rowSum,i,(int)1e8),getOrDefault(colSum,i,(int)1e8));
//             }
//             if (i == j) {
//                 // System.out.println(min);
//                 ans[i][j] = min;
//             }
//             else {
//                 if (cur == rowSum[i]) break;
//                 int diff = colSum[j] - colwa[j];
//                 if (i < j && j < rows) diff = 0;
//                 // System.out.println(i+"=i   "+j+"=j   ");
//                 // System.out.println(rowSum[i]+"-"+min+"      "+colSum[j]+"-"+colwa[j]);
//                 ans[i][j] = Math.min(
//                     rowSum[i] - min,
//                     diff
//                 );
//             }
//             colwa[j] += ans[i][j];
//             cur += ans[i][j];
//         }
//     }
//     return ans;
// }
// int getOrDefault(int[] arr, int index, int defaultVal) {
//     if (index >= 0 && index < arr.length) return arr[index];
//     return defaultVal;
// }
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

4   01 00 
12  00 00
10  00    03
1   00       01
0   00 00 00 00 00

    01 00 03 16 07

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