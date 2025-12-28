/*
 * Submission: 1828846447
 * Problem: Smallest Integer Divisible by K (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-13 15:37:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int smallestRepunitDivByK(int k) {
        if ((k&1) == 0) return -1;
        if (k%5 == 0) return -1;
        int ans = 1;
        long num = 1;
        while(num%k != 0) {
            ans++;
            num*=10;
            num++;
        } return ans;
    }
}
/*
1
11
111 37
1111
*/