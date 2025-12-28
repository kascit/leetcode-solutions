/*
 * Submission: 1760340764
 * Problem: Pass the Pillow (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 10:25:03 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int passThePillow(int n, int time) {
        int f = (time)%(n-1);
        // System.out.println(f);
        boolean goinLeft = (time > n-1 && (time/(n-1)&1) == 1);
        // System.out.println(goinLeft);
        if (f == 0) {
            if (time < n) goinLeft = true;
            if (goinLeft) return n;
            return 1;
        }
        // System.out.println(time/(n-1));
        // System.out.println(f);
        return (goinLeft) ? n - f : f + 1;
    }
}