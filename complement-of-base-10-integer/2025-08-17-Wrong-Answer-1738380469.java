/*
 * Submission: 1738380469
 * Problem: Complement of Base 10 Integer (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 10:16:36 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int bitwiseComplement(int n) {
        int xor = 1;
        while(xor <= n){
            xor <<= 1;
        }
        xor -= 1;
        return n ^ xor;
    }
}