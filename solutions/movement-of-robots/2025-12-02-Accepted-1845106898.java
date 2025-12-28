/*
Submission: 1845106898
Status: Accepted
Timestamp: 2025-12-02 14:54:20 UTC
Runtime: 16 ms
Memory: 73.7 MB
*/

import java.util.*;

class Solution {
    static final int MOD = (int)1e9 + 7;

    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long[] pos = new long[n];
        for (int i = 0; i < n; i++) {
            pos[i] = (s.charAt(i) == 'L') ? (long)nums[i] - d : (long)nums[i] + d;
        }

        Arrays.sort(pos);

        long ansMod = 0L;
        long prefixMod = 0L;

        for (int i = 0; i < n; i++) {
            long pMod = pos[i] % MOD;
            if (pMod < 0) pMod += MOD;


            long term = ( (pMod * (long)i) % MOD - prefixMod ) % MOD;
            if (term < 0) term += MOD;

            ansMod += term;
            if (ansMod >= MOD) ansMod -= MOD;

            prefixMod += pMod;
            if (prefixMod >= MOD) prefixMod -= MOD;
        }

        return (int) ansMod;
    }
}
