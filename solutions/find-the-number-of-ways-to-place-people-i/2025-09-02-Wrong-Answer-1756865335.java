/*
 * Submission: 1756865335
 * Problem: Find the Number of Ways to Place People I (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-02 09:41:30 UTC
 * Runtime: N/A
 * Memory: N/A
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
            for (int j = i - 1; j >= 0 && (matrix[i][0] <= matrix[j][0] || matrix[i][1] <= matrix[j][1]) ; j--) {
                if (a == 0 && b == 0 && c == 0 && matrix[i][0] > matrix[j][0] && matrix[i][1] < matrix[j][1]) {
                    // System.out.print("did   ->");
                    a++;
                } else if (b == 0 && matrix[i][0] == matrix[j][0]) {
                    // System.out.print("did   ->");
                    b++;
                } else if (c == 0 && matrix[i][1] == matrix[j][1]) {
                    // System.out.print("did   ->");
                    c++;
                }
            }
            ans += a + b + c;
            // System.out.println(Arrays.toString(matrix[i]));
        } 
        return ans;
    }
}