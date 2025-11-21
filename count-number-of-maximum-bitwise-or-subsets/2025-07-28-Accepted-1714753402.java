/*
 * Submission: 1714753402
 * Problem: Count Number of Maximum Bitwise-OR Subsets (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-28 16:08:52 UTC
 * Runtime: 3 ms
 * Memory: 41.4 MB
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
        if (curOR == maxOR){
        //    System.out.println("plus");
            cnt[0]+= Math.pow(2,nums.length - idx);
            return;
        }
        // if (idx == nums.length) return;
        for (int i= idx; i < nums.length; i++) bt(cnt,curOR | nums[i], maxOR, nums, i+1);
        // System.out.println("not take:");
        //bt(cnt,curOR, maxOR, nums, idx+1);
        return;
    }
}