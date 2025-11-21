/*
 * Submission: 1737056547
 * Problem: Number of Bit Changes to Make Two Integers Equal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 09:04:09 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int minChanges(int n, int k) {
        if ((n&k) != k) return -1;
        int xor = n^k;
        int c = 0;
        while(xor > 0){
            xor&=(xor-1);
            c++;
        } return c;
    }
}
/*
1101
1110
0011

1101
0100
1001*/