/*
 * Submission: 1743444607
 * Problem: Sort the Students by Their Kth Score (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:45:02 UTC
 * Runtime: 2 ms
 * Memory: 52.6 MB
 */

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int rows = score.length, cols = score[0].length;
        for(int maxRow = 0; maxRow < rows - 1; maxRow++) {
            int maxIdr = maxRow;
            for(int itr = maxRow+1; itr < rows; itr++){
                if (score[itr][k] > score[maxIdr][k]) maxIdr = itr;
            }
            if (maxIdr != maxRow){
                swap(score,maxRow,maxIdr,cols);
            }
        }
        return score;
    }

    private void swap(int[][] arr, int up, int down, int cols) {
        for (int i = 0; i < cols; i++) {
            int TEMP = arr[up][i];
            arr[up][i] = arr[down][i];
            arr[down][i] = TEMP;
        }
    }
}