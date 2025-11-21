/*
 * Submission: 1835287847
 * Problem: Minimum Operations to Make Array Equal (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-20 16:17:11 UTC
 * Runtime: 0 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int minOperations(int n) {
        return (( ( n-1 )/2 )*2+1 + (((n&1) == 0) ? 1 : 0)) * (n/2) - ((n/2)*(2+((n/2)-1)*2)/2);
    }
}
/*
1 3 5 7
2 3 5 6
3 3 5 5
4 3 5 4
4 4 4 4
*/