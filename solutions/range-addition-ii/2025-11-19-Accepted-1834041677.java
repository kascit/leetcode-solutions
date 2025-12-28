/*
 * Submission: 1834041677
 * Problem: Range Addition II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:37:09 UTC
 * Runtime: 0 ms
 * Memory: 48.3 MB
 */

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int m1 = m, m2 = n;
        for (int[] op : ops) {
            m1 = Math.min(op[0],m1);
            m2 = Math.min(op[1],m2);
            // System.out.println(m1+"    "+m2);
        }
        return m1*m2;
    }
}