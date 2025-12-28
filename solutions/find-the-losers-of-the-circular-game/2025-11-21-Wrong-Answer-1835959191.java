/*
 * Submission: 1835959191
 * Problem: Find the Losers of the Circular Game (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-21 11:49:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] circularGameLosers(int n, int k) {
        if (n == 1) return new int[]{};
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= n;i++) s.add(i);
        int idx = 1, cur = 1;;
        do {
            idx += k*cur;
            cur++;
            idx %= n;
            s.remove(idx);
        } while (idx != 1);

        idx = 0;
        int[] ans = new int[s.size()];
        for (int x : s) {
            ans[idx++] = x;
        } return ans;
    }
}