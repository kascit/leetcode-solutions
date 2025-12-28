/*
 * Submission: 1738380888
 * Problem: Complement of Base 10 Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:17:05 UTC
 * Runtime: 0 ms
 * Memory: 41.2 MB
 */

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int xor = 1;
        while(xor <= n){
            xor <<= 1;
        }
        xor -= 1;
        return n ^ xor;
    }
}