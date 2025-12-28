/*
 * Submission: 1756895118
 * Problem: Find the Number of Ways to Place People I (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 10:14:54 UTC
 * Runtime: 9 ms
 * Memory: 44.7 MB
 */

class Solution {
    public int numberOfPairs(int[][] matrix) {
        Arrays.sort(matrix,
            Comparator.comparingInt((int[] row) -> row[0])
                      .thenComparing(Comparator.comparingInt((int[] row) -> row[1]).reversed())
        );
        int rows = matrix.length, ans = 0;
        // System.out.println(Arrays.toString(matrix[0]));
         for (int i = 1; i < rows; i++) {
            int a = 0, b = 0, c = 0;
            int maxy = 51, maxx = -1, x = matrix[i][0], y = matrix[i][1];
            for (int j = i - 1; j >= 0 && (maxx <= matrix[j][0] || maxy >= matrix[j][1]) ; j--) {
                // System.out.println(maxx+"   "+maxy);
                if (matrix[j][1] < maxy) {
                    if (x > matrix[j][0] && matrix[j][1] > y) {
                        // System.out.print("did   diag->");
                        maxy = matrix[j][1];
                        a++;
                    } else if (x == matrix[j][0]) {
                        // System.out.print("did   x->");
                        maxy = matrix[j][1];
                        b++;
                    } else if (y == matrix[j][1]) {
                        // System.out.print("did   y->");
                        maxy = matrix[j][1];
                        c++;
                    }
                }
            }
            ans += a + b + c;
            // System.out.println(Arrays.toString(matrix[i]));
        } 
        return ans;
    }
}