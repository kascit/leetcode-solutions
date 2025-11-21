/*
 * Submission: 1738378698
 * Problem: Number Complement (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:14:41 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int findComplement(int n) {
    if (n == 0) return 1; 
    int msb = 31 - Integer.numberOfLeadingZeros(n); 
    int mask = (1 << (msb + 1)) - 1; 
    return (~n) & mask;
    }
}
/*
0000 0101
1111 0010
1111 0011
0000 1100
-6
*/