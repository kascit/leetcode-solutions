/*
Submission: 1839127276
Status: Accepted
Timestamp: 2025-11-25 05:52:56 UTC
Runtime: 2 ms
Memory: 41.9 MB
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