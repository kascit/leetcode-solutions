/*
 * Submission: 1776257368
 * Problem: Design Spreadsheet (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-19 16:41:12 UTC
 * Runtime: 108 ms
 * Memory: 56 MB
 */

class Spreadsheet {
    private final int[][] mappy;

    public Spreadsheet(int rows) {
        mappy = new int[26][rows + 1];
    }

    public void setCell(String cell, int value) {
        mappy[cell.charAt(0) - 'A'][parseRow(cell)] = value;
    }

    public void resetCell(String cell) {
        mappy[cell.charAt(0) - 'A'][parseRow(cell)] = 0;
    }

    public int getValue(String formula) {
        int plus = formula.indexOf('+');
        String left = formula.substring(1, plus);
        String right = formula.substring(plus + 1);
        return parseCellOrNumber(left) + parseCellOrNumber(right);
    }

    private int parseRow(String cell) {
        int row = 0;
        for (int i = 1; i < cell.length(); i++) {
            row = row * 10 + (cell.charAt(i) - '0');
        }
        return row;
    }

    private int parseCellOrNumber(String token) {
        char c = token.charAt(0);
        if (c >= 'A' && c <= 'Z') {
            int col = c - 'A';
            int row = 0;
            for (int i = 1; i < token.length(); i++) {
                row = row * 10 + (token.charAt(i) - '0');
            }
            return mappy[col][row];
        } else {
            int num = 0;
            for (int i = 0; i < token.length(); i++) {
                num = num * 10 + (token.charAt(i) - '0');
            }
            return num;
        }
    }
}
