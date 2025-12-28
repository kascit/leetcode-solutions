/*
Submission: 1840359950
Status: Wrong Answer
Timestamp: 2025-11-26 15:51:47 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    ArrayList<Integer> mins = new ArrayList<>();
    int rows, cols;
    int[][] d;
    public int calculateMinimumHP(int[][] dungeon) {
        this.d = dungeon;
        this.rows = dungeon.length;
        this.cols = dungeon[0].length;
        fn(0,0,0,Integer.MAX_VALUE);
        int maxMin = Integer.MIN_VALUE;
        for (int m : mins) {
            System.out.println(m);
            maxMin = (m > maxMin) ? m : maxMin;
        }
        if (maxMin > 0) return 0;
        return -maxMin + 1;
    }

    void fn(int i, int j, int run, int min) {
        if ((i == rows && j == cols - 1)) {
            mins.add(min);
        }
        if (i >= rows || j >= cols) return;
        run += d[i][j];
        min = (run < min) ? run : min;
        fn(i+1,j,run,min);
        fn(i,j+1,run,min);
    }
}