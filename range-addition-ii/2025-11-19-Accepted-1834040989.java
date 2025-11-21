/*
 * Submission: 1834040989
 * Problem: Range Addition II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:36:07 UTC
 * Runtime: 1 ms
 * Memory: 48.6 MB
 */

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;
        for (int[] op : ops) {
            m1 = Math.min(op[0],m1);
            m2 = Math.min(op[1],m2);
            // System.out.println(m1+"    "+m2);
        } if (m1 != Integer.MAX_VALUE && m2 != Integer.MAX_VALUE) return m1*m2;
        return m*n;
    }
}