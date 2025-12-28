/*
 * Submission: 1835958819
 * Problem: Find the Losers of the Circular Game (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-11-21 11:49:06 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] circularGameLosers(int n, int k) {
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