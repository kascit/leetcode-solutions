/*
 * Submission: 1738775196
 * Problem: Binary Prefix Divisible By 5 (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 17:06:44 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int len = nums.length;
        int cur = 0;
        for(int i = 0; i < len; i++){
            cur<<=1;
            cur|=nums[i];
            if (cur%5 == 0) ans.add(true);
            else ans.add(false);
        } return ans;
    }
}