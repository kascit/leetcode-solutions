/*
 * Submission: 1606467047
 * Problem: Fibonacci Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 10:15:01 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int fib(int n) {
        int first = 0, second = 1, ans = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for(int i = 2; i <= n; i++){
            ans = first + second;
            first = second;
            second = ans;
        }return ans;
    }
}