/*
Submission: 1845131993
Status: Accepted
Timestamp: 2025-12-02 15:26:06 UTC
Runtime: 0 ms
Memory: 42.5 MB
*/

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int x = -1, y = -1, z = -1;
        x = Math.min(a,Math.min(b,c));
        z = Math.max(a,Math.max(b,c));
        y = a + b + c - x - z;
        // System.out.println(x +" " + y + " " + z);
        int d1 = z - y, d2 = y - x;
        if (d1 == 1 && d2 == 1) return new int[]{0,0};
        a = 0;
        if (d1 > 1 && d2 > 1) {
          a = 2;
          if (d1 < 3 || d2 < 3) {
            a--;
          }
        } else a = 1;
        return new int[]{a,z-x-2};

    }
}