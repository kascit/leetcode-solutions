/*
Submission: 1851849987
Status: Accepted
Timestamp: 2025-12-10 08:53:54 UTC
Runtime: 2 ms
Memory: 92.1 MB
*/

class Solution {
    public int countPermutations(int[] complexity) {
        int min = complexity[0];
        int n = complexity.length;
        for (int i = 1; i < n; i++) {
          if (complexity[i] <= min) return 0;
        }
        long ans = 1;
        for (int i = 2; i < n; i++) {
          ans = (ans * i) % 1_000_000_007;
        } return (int) ans;
    }
}