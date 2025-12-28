/*
 * Submission: 1746541424
 * Problem: Design Neighbor Sum Service (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:31:35 UTC
 * Runtime: 14 ms
 * Memory: 45.5 MB
 */

class NeighborSum { 
     
    private int[][] internalGrid;
    private int [] xposition;
    private int [] yposition;
    private int maxRows;
    private int maxCols;
    public NeighborSum(int[][] grid) {
        this.internalGrid = grid;
        int n = (grid.length * grid.length);
        this.maxRows = grid.length;
        this.maxCols = grid[0].length;
        this.xposition = new int [n];
        this.yposition = new int [n];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int num = grid[i][j];
                xposition[num] = i;
                yposition[num] = j;
            }
        }
    }

    public int adjacentSum(int value) {
        int i = this.xposition[value];
        int j = this.yposition[value];
        int sum = 0 ;
        if(i-1 >= 0){sum+=internalGrid[i-1][j];}
        if(j-1 >= 0){sum+=internalGrid[i][j-1];}
        if(i+1 <maxRows ){sum+=internalGrid[i+1][j];}
        if(j+1 <maxCols ){sum+=internalGrid[i][j+1];}
        return sum;
    
    }
    
    public int diagonalSum(int value) {
        int i = this.xposition[value];
        int j = this.yposition[value];
        int sum = 0 ;
        if(i-1 >= 0 && j-1>=0){sum+=internalGrid[i-1][j-1];}
        if(i-1 >= 0 && j+1 < maxCols){sum+=internalGrid[i-1][j+1];}
        if(i+1 <maxRows && j-1 >=0 ){sum+=internalGrid[i+1][j-1];}
        if(i+1 <maxRows && j+1 <maxCols ){sum+=internalGrid[i+1][j+1];}
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */