/*
 * Submission: 1758429012
 * Problem: Letter Tile Possibilities (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:32:40 UTC
 * Runtime: 1 ms
 * Memory: 41.5 MB
 */

import java.math.BigInteger;
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        int len = tiles.length();
        for (int i = 0; i < len; i++) {
            freq[tiles.charAt(i)-'A']++;
        }
        return countSequences(freq);
    }

    public static int countSequences(int[] counts) {
        int n = 0;
        for (int c : counts) n += c;

        int[] ways = new int[n + 1];
        Arrays.fill(ways, 0);
        ways[0] = 1;

        int cur = 0;
        for (int c : counts) {
            int[] next = new int[cur + c + 1];
            Arrays.fill(next, 0);

            for (int L = 0; L <= cur; L++) {
                if (ways[L] == 0) continue;

                for (int add = 0; add <= c; add++) {
                    next[L + add] += ways[L] * binom(L + add, add);
                }
            }

            ways = next;
            cur += c;
        }

        int ans = 0;
        for (int L = 1; L <= cur; L++) {
            ans += ways[L];
        }

        return ans;
    }

    private static int binom(int n, int k) {
        if (k < 0 || k > n) return 0;
        k = Math.min(k, n - k);

        int res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - k + i) / i;
        }
        return res;
    }
}
