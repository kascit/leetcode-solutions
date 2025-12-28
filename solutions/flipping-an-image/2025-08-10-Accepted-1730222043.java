/*
 * Submission: 1730222043
 * Problem: Flipping an Image (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 14:44:40 UTC
 * Runtime: 0 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}