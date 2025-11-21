/*
 * Submission: 1720196757
 * Problem: Add Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-02 05:18:03 UTC
 * Runtime: 1 ms
 * Memory: 41 MB
 */

class Solution {
    public int addDigits(int num) {
        return solve(num);
    }

    int solve(int n){
        if (n < 10) return n;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return solve(sum);
    }
}