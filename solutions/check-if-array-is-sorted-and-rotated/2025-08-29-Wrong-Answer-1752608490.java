/*
 * Submission: 1752608490
 * Problem: Check if Array Is Sorted and Rotated (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-29 16:07:05 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean check(int[] nums) {

        int change = 0, len = nums.length;
        if (len <=3) return true;
        boolean incr = (nums[1] >= nums[0]);
        if (!incr) change++;
        // System.out.println(change);
        for(int i = 1; i < len; i++) {
            // System.out.println(incr);
            // System.out.println(i+"   "+change);
            // System.out.println(nums[i]+"   "+nums[i+1]);
            if (incr) {
                if (nums[(i+1)%len] < nums[i]){
                    change++;
                    incr = false;
                }
            } else {
                if (nums[(i+1)%len] > nums[i]) {
                    change++;
                    incr = true;
                }
            }
            if (change == 3) return false;
        } 
        
        return true;
    }
}