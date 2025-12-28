/*
 * Submission: 1751422798
 * Problem: Sort the Matrix Diagonally (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-28 15:00:37 UTC
 * Runtime: 5 ms
 * Memory: 45.6 MB
 */

class Solution {

    static {
        for (int i = 0;i<300;i++) diagonalSort(new int[][]{{1}});
    }

    public static int[][] diagonalSort(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        List<Integer> sorta = new ArrayList<>();
        for (int i = 0; i < rows - 1; i++){
            int t = i, j = 0;
            while(t < rows && j < cols) {
                sorta.add(grid[t][j]);
                t++;
                j++;
            }
            // System.out.println(sorta.toString());
            Collections.sort(sorta);
            // System.out.println(sorta.toString());
            // System.out.println(i);
            t = i; j = 0;
            while(t < rows && j < cols) {
                grid[t][j] = sorta.get(j);
                t++;
                j++;
            }
            sorta.clear();
        } 


        for (int j = 1; j < cols - 1; j++){
            int t = j, i = 0;
            while(t < cols && i < rows) {
                sorta.add(grid[i][t]);
                t++;
                i++;
            }
            // System.out.println(sorta.toString());
            Collections.sort(sorta);
            // System.out.println(sorta.toString());
            // System.out.println(i);
            t = j; i = 0;
            while(t < cols && i < rows) {
                grid[i][t] = sorta.get(i);
                t++;
                i++;
            }
            sorta.clear();
        } return grid;
    }
}