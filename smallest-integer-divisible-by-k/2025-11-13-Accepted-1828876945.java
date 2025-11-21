/*
 * Submission: 1828876945
 * Problem: Smallest Integer Divisible by K (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 16:13:44 UTC
 * Runtime: 2 ms
 * Memory: 42 MB
 */

class Solution {
    public int smallestRepunitDivByK(int k) {
        if ((k&1) == 0) return -1;
        if (k%5 == 0) return -1;
        int ans = 1;
        long num = 1;
        while(true) {
            if((num = num%k) == 0) return ans;
            num = num*10 + 1;
            ans++;
        }
    }
}
/*
1
11
111 37
1111
*/