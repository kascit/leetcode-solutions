/*
 * Submission: 1776259570
 * Problem: Design Spreadsheet (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-19 16:43:20 UTC
 * Runtime: 96 ms
 * Memory: 55.6 MB
 */

class Spreadsheet {
    private final int[][] mappy;

    public Spreadsheet(int rows) {
        mappy = new int[26][rows + 1];
    }

    public void setCell(String cell, int value) {
        mappy[cell.charAt(0) - 'A'][parseRow(cell, 1)] = value;
    }

    public void resetCell(String cell) {
        mappy[cell.charAt(0) - 'A'][parseRow(cell, 1)] = 0;
    }

    public int getValue(String formula) {
        int plus = formula.indexOf('+');
        return parseCellOrNumber(formula, 1, plus) +
               parseCellOrNumber(formula, plus + 1, formula.length());
    }

    private int parseRow(String s, int start) {
        int row = 0;
        for (int i = start; i < s.length(); i++) {
            row = row * 10 + (s.charAt(i) - '0');
        }
        return row;
    }

    private int parseCellOrNumber(String s, int start, int end) {
        char c = s.charAt(start);
        if (c >= 'A' && c <= 'Z') {
            int col = c - 'A';
            int row = 0;
            for (int i = start + 1; i < end; i++) {
                row = row * 10 + (s.charAt(i) - '0');
            }
            return mappy[col][row];
        } else {
            int num = 0;
            for (int i = start; i < end; i++) {
                num = num * 10 + (s.charAt(i) - '0');
            }
            return num;
        }
    }
}
