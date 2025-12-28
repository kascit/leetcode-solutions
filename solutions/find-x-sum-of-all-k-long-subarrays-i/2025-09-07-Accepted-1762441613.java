/*
 * Submission: 1762441613
 * Problem: Find X-Sum of All K-Long Subarrays I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:33:03 UTC
 * Runtime: 5 ms
 * Memory: 45 MB
 */

class Solution {
    int[] freq;
    boolean[] taken;
    int x;
    int max;
    public int[] findXSum(int[] nums, int k, int x) {
        this.x = x;
        this.max = 0;
        for (int n : nums) {
            if (n > max) max = n;
        }
        freq = new int[max+1];
        taken = new boolean[max+1];

        int len = nums.length;
        int newLen = len - k + 1;
        int[] ans = new int[newLen];

        for (int i = 0; i < k; i++) {
            freq[nums[i]]++;
        }

        ans[0] = xSum();
        // System.out.println(Arrays.toString(freq));
        for (int i = 1; i < newLen; i++) {
            freq[nums[i-1]]--;
            freq[nums[i-1+k]]++;
            // System.out.println(Arrays.toString(freq));
            taken = new boolean[max+1];
            ans[i] = xSum();
        }
        return ans;
    }

    private int xSum(){
        int a = 0;
        for (int k = 0; k < x; k++) {
            int m = -1;
            for (int i = max; i>=0; i--) {
                if(!taken[i] && ((m == -1) || (freq[i] > freq[m])) ) {
                    m = i;
                }
            }
            if (m != -1) {
                taken[m] = true;
                a += freq[m]*m;
            }
            // System.out.println(Arrays.toString(taken));
            // System.out.println(m+"   "+freq[m]);
            // System.out.println(a);
        }
        return a;
    }
}