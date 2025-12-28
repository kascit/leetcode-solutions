/*
Submission: 1845126464
Status: Wrong Answer
Timestamp: 2025-12-02 15:19:13 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int x = -1, y = -1, z = -1;
        x = Math.min(a,Math.min(b,c));
        z = Math.max(a,Math.max(b,c));
        y = a + b + c - x - z;
        // System.out.println(x +" " + y + " " + z);
        if (z - y  == 1 && y -x == 1) return new int[]{0,0};
        return new int[]{1,z-x-2};

    }
}