/*
 * Submission: 1831281425
 * Problem: Count Special Quadruplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:45:45 UTC
 * Runtime: 117 ms
 * Memory: 46.5 MB
 */

class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;

        
        int pSize = (n * (n - 1)) / 2;
        int[] prefix = new int[pSize];
        int pIdx = 0;
        int[][] pIdxPair = new int[pSize][2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                prefix[pIdx] = nums[i] + nums[j];
                pIdxPair[pIdx][0] = i;
                pIdxPair[pIdx][1] = j;
                pIdx++;
            }
        }

        
        int sSize = (n * (n - 1)) / 2;
        int[] suffix = new int[sSize];
        int sIdx = 0;
        int[][] sIdxPair = new int[sSize][2];

        for (int k = 0; k < n - 1; k++) {
            for (int l = k + 1; l < n; l++) {
                suffix[sIdx] = nums[l] - nums[k];
                sIdxPair[sIdx][0] = k;
                sIdxPair[sIdx][1] = l;
                sIdx++;
            }
        }

        for (int pi = 0; pi < pIdx; pi++) {
            int i = pIdxPair[pi][0], j = pIdxPair[pi][1];
            for (int si = 0; si < sIdx; si++) {
                int k = sIdxPair[si][0], l = sIdxPair[si][1];
                if (i < j && j < k && k < l && prefix[pi] == suffix[si]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
