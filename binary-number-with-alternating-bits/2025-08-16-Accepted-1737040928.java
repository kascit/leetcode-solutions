/*
 * Submission: 1737040928
 * Problem: Binary Number with Alternating Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:46:04 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public boolean hasAlternatingBits(int n) {
        int flag = ((n&1) == 1) ? 1 : 0 ;
        while(n>0){
            if ( (n&1) != flag ) return false;
            n>>=1;
            flag ^= 1;
        } return true;
    }
}