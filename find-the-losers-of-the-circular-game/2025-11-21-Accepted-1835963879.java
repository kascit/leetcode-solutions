/*
 * Submission: 1835963879
 * Problem: Find the Losers of the Circular Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:58:50 UTC
 * Runtime: 4 ms
 * Memory: 46.6 MB
 */

class Solution {
    public int[] circularGameLosers(int n, int k) {
        if (n == 1) return new int[]{};
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i < n;i++) s.add(i);
        int idx = 0, cur = 1;
        // s.remove(idx);
        do {
            idx += k*cur;
            cur++;
            idx %= (n);
            // System.out.println(idx);
            if (!s.contains(idx)) break;
            s.remove(idx);
        } while (idx != 0);

        idx = 0;
        int[] ans = new int[s.size()];
        for (int x : s) {
            ans[idx++] = x+1;
        } return ans;
    }
}