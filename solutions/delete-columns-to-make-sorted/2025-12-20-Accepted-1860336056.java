/*
Submission: 1860336056
Status: Accepted
Timestamp: 2025-12-20 06:34:37 UTC
Runtime: 8 ms
Memory: 46.7 MB
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
