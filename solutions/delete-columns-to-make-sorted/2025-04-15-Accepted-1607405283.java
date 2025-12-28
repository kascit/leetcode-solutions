/*
 * Submission: 1607405283
 * Problem: Delete Columns to Make Sorted (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-15 09:39:34 UTC
 * Runtime: 7 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int rows = strs.length;
        int cols = strs[0].length();

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows - 1; row++) {
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
