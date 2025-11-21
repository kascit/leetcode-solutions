/*
 * Submission: 1605914507
 * Problem: Domino and Tromino Tiling (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 18:59:50 UTC
 * Runtime: 0 ms
 * Memory: 40.1 MB
 */

class Solution {
    public int numTilings(int n) {
        long first = 1;
        long second = 2;
        long third = 5;
        if (n == 0) return 0;
        if (n == 1) return (int) first;
        if (n == 2) return (int) second;
        if (n == 3) return (int) third;
        long ans = 0;
        for (int i = 4; i <= n; i++){
            ans = 2*third + first;
            ans %=1e9+7;
            first = second;
            second = third;
            third = ans;
        }

        return (int) ans;
    }
}