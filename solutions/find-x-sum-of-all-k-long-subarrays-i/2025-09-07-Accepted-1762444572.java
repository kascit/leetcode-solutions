/*
 * Submission: 1762444572
 * Problem: Find X-Sum of All K-Long Subarrays I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:36:56 UTC
 * Runtime: 5 ms
 * Memory: 44.9 MB
 */

class Solution {
    int[] freq;
    int[] seenVersion; 
    int curVersion = 1;
    int x, max;

    public int[] findXSum(int[] nums, int k, int x) {
        this.x = x;
        this.max = 0;
        for (int n : nums) max = Math.max(max, n);

        freq = new int[max + 1];
        seenVersion = new int[max + 1];

        int len = nums.length;
        int[] ans = new int[len - k + 1];

        
        for (int i = 0; i < k; i++) freq[nums[i]]++;
        ans[0] = xSum();

        for (int i = 1; i <= len - k; i++) {
            freq[nums[i - 1]]--;
            freq[nums[i - 1 + k]]++;
            curVersion++;
            ans[i] = xSum();
        }
        return ans;
    }

    private int xSum() {
        int sum = 0, picks = 0;
        for (int p = 0; p < x; p++) {
            int best = -1;
            for (int i = max; i >= 0; i--) {
                if (seenVersion[i] == curVersion) continue;
                if (best == -1 || freq[i] > freq[best]) best = i;
            }
            if (best == -1 || freq[best] == 0) break;
            seenVersion[best] = curVersion;
            sum += best * freq[best];
            picks++;
        }
        return sum;
    }
}
