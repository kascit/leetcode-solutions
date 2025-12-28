/*
 * Submission: 1835964126
 * Problem: Find the Losers of the Circular Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:59:17 UTC
 * Runtime: 1 ms
 * Memory: 46.6 MB
 */

class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] tmp = new boolean[n];
        
        int p = 0;
        tmp[p] = true;
        int d = k;
        int count = 1;
        while (true) {
            p = (p + d) % n;
            // game over
            if (tmp[p]) {
                break;
            }
            tmp[p] = true;
            count++;
            d += k;
        }

        int[] res = new int[n-count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!tmp[i]) {
                // it is 0 based when calculate it
                res[index++] = i+1;
            }
        }

        return res;
    }
}