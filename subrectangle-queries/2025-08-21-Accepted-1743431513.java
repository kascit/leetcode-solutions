/*
 * Submission: 1743431513
 * Problem: Subrectangle Queries (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:34:15 UTC
 * Runtime: 22 ms
 * Memory: 47.9 MB
 */

class SubrectangleQueries {
    int[][] recy;
    public SubrectangleQueries(int[][] rectangle) {
        recy = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++)
            for (int j = col1; j <= col2; j++)
                recy[i][j] = newValue;
    }
    
    public int getValue(int row, int col) {
        return recy[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */