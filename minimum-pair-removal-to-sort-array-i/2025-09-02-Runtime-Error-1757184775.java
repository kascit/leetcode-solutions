/*
 * Submission: 1757184775
 * Problem: Minimum Pair Removal to Sort Array I (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-02 15:19:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int len = nums.length, ans = 0;
        boolean goon = true;
        // System.out.println(Arrays.toString(nums));
        while (goon) {
            goon = false;
            int sum = 2001, swap = -1, eswap = -1, i = 0, j = 1;
            while (i < len - 1 && j < len) {

                if (nums[i] == 1001) {
                    i++;
                    continue;
                }

                if (j<=i || nums[j] == 1001) {
                    j++;
                    continue;
                }


                if (j == len) break;

                // System.out.println(i+"  "+j);
                if (nums[i] > nums[j]) {
                    // nums[i+1] += nums[i];
                    goon = true;
                    // ans++;
                }
                if (nums[i] + nums[j] < sum) {
                    sum = nums[i] + nums[j];
                    swap = i;
                    eswap = j;
                }
                i++;
            }

            // System.out.println("blahblah");
            if (goon) {
                // System.out.println(swap+"->"+nums[swap]+"   "+eswap+"->"+nums[eswap]);
                nums[eswap] += nums[swap];
                nums[swap] = 1001;
                ans++;
                // System.out.println(Arrays.toString(nums));
            }

        } 
        return ans;
    }
}