/*
 * Submission: 1753134595
 * Problem: Check if Every Row and Column Contains All Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 05:55:50 UTC
 * Runtime: 28 ms
 * Memory: 45.5 MB
 */

class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                int cur = matrix[i][j];
                int tur = matrix[j][i];
                if (s.contains(cur) || t.contains(tur) ) return false;
                t.add(tur);
                s.add(cur);
            }
            s.clear(); t.clear();
        } return true;
    }
}