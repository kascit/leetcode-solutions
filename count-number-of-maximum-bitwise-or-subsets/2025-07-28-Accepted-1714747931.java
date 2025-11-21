/*
 * Submission: 1714747931
 * Problem: Count Number of Maximum Bitwise-OR Subsets (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-28 16:04:46 UTC
 * Runtime: 9 ms
 * Memory: 41 MB
 */

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        int[] ans = new int[1];
        for (int i : nums){
            maxOR |= i;
        }

        bt(ans,0,maxOR,nums,0);
        return ans[0];

    }

    void bt(int[] cnt, int curOR, int maxOR, int[] nums, int idx){
        //  System.out.println(curOR +" " + idx);
        if (idx == nums.length){
        //    System.out.println("plus");
            if (curOR == maxOR) cnt[0]++;
            return;
        }
        // if (idx == nums.length) return;
        bt(cnt,curOR | nums[idx], maxOR, nums, idx+1);
        // System.out.println("not take:");
        bt(cnt,curOR, maxOR, nums, idx+1);
        return;
    }
}