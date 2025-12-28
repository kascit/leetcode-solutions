/*
 * Submission: 1604983474
 * Problem: Minimum Flips to Make a OR b Equal to c (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 21:12:09 UTC
 * Runtime: 0 ms
 * Memory: 40.6 MB
 */

class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;
            if (bitC == 0) {
                flips += (bitA + bitB); 
            } else {
                if (bitA == 0 && bitB == 0) {
                    flips += 1; 
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }
}