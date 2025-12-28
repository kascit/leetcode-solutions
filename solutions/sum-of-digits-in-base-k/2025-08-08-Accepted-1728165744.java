/*
 * Submission: 1728165744
 * Problem: Sum of Digits in Base K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-08 16:49:41 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        while(n>0){
            ans+=n%k;
            n/=k;
        } return ans;
    }
}