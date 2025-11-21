/*
 * Submission: 1776255039
 * Problem: Design Spreadsheet (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-19 16:38:59 UTC
 * Runtime: 117 ms
 * Memory: 56.4 MB
 */

class Spreadsheet {
    int[][] mappy;
    public Spreadsheet(int rows) {
        mappy = new int[26][rows+1];
    }
    
    public void setCell(String cell, int value) {
        mappy[cell.charAt(0)-'A'][Integer.parseInt(cell.substring(1,cell.length()))] = value;
    }
    
    public void resetCell(String cell) {
        mappy[cell.charAt(0)-'A'][Integer.parseInt(cell.substring(1,cell.length()))] = 0;
    }
    
    public int getValue(String formula) {
        String[] hehe = formula.substring(1,formula.length()).split("\\+");
        int a = (hehe[0].charAt(0) > '9') ? mappy[hehe[0].charAt(0)-'A'][Integer.parseInt(hehe[0].substring(1,hehe[0].length()))] : Integer.parseInt(hehe[0]); 
        int b = (hehe[1].charAt(0) > '9') ? mappy[hehe[1].charAt(0)-'A'][Integer.parseInt(hehe[1].substring(1,hehe[1].length()))] : Integer.parseInt(hehe[1]); 
        return a+b;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */