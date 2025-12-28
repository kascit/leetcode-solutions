/*
 * Submission: 1741645003
 * Problem: Count Square Submatrices with All Ones (Medium)
 * Status: Accepted
 * Language: c
 * Timestamp: 2025-08-20 05:13:51 UTC
 * Runtime: 4 ms
 * Memory: 13.9 MB
 */

int countSquares(int** matrix, int matrixSize, int* matrixColSize) {
    int rows = matrixSize;
    int cols = matrixColSize[0]; // all rows same length
    int ans = 0;

    // handle first row
    for (int j = 0; j < cols; j++) ans += matrix[0][j];
    // handle first col
    for (int i = 1; i < rows; i++) ans += matrix[i][0];

    // main DP
    for (int i = 1; i < rows; i++) {
        int* cur = matrix[i];
        int* prev = matrix[i - 1];
        for (int j = 1; j < cols; j++) {
            if (cur[j] == 1) {
                int left = cur[j - 1];
                int top  = prev[j];
                int diag = prev[j - 1];

                // min-of-3 inline
                int min = left < top ? left : top;
                if (diag < min) min = diag;

                cur[j] = 1 + min;
            }
            ans += cur[j];
        }
    }
    return ans;
}
