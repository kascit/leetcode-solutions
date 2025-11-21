/*
 * Submission: 1604566287
 * Problem: Max Consecutive Ones III (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:09:17 UTC
 * Runtime: 4 ms
 * Memory: 46.8 MB
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int r = 0, max = k;
        for(int i = 0; i < nums.length; i++){
            if (i != 0 && nums[i-1] == 0) k++;
            while(r < nums.length && (nums[r] == 1 || k > 0) ){
                //System.out.println("i: " + i + "r: " + r + "k: " + k);
                if (nums[r] == 0) k--;
                r++;
            }
            //System.out.println("i: " + i + "r: " + r);
            int len = r - i;
            max = Math.max(len,max);
        }
        return max;
    }
}