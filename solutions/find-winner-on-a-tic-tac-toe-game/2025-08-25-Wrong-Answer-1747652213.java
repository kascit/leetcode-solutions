/*
 * Submission: 1747652213
 * Problem: Find Winner on a Tic Tac Toe Game (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-25 11:21:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    private static final int MASK_001 = 0b1001001001001001;
    public String tictactoe(int[][] moves) {
        int[] a = new int[1], b = new int[1];
        boolean even = true;
        for (int[] move : moves) {
            if(even) {
                doi(move[0],move[1],a);
            } else {
                doi(move[0],move[1],b);
            }
            even = !even;
        }      
        // System.out.println(Integer.toBinaryString(a[0]));
        // System.out.println(Integer.toBinaryString(b[0]));
        if (won(a[0])) return "A";
        if (won(b[0])) return "B";
        return (moves.length == 9) ? "Draw" : "Pending";

    }
    private void doi (int i, int j, int[] by) {
        int r = 1<<(9+i*3);
        int c = 1<<(j*3);
        by[0] += r;
        by[0] += c;
    }

    public static boolean won(int num) {
        int tmp = num;
        while (tmp > 0) {
            if ((tmp & 3) == 3) return true;
            tmp >>= 3;
        }

        // System.out.println(Integer.toBinaryString(num));
        if ((num & MASK_001) == MASK_001) return true;

        return false;
    }
}