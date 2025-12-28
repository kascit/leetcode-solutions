/*
 * Submission: 1731423761
 * Problem: Special Array I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:00:08 UTC
 * Runtime: 0 ms
 * Memory: 43.5 MB
 */

class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean even = true;
        if ((nums[0]&1) == 0) even = false;
        for(int i = 1; i < nums.length; i++){
            if(!even){
                if ((nums[i]&1) == 0) return false;
            } else {
                if ((nums[i]&1) == 1) return false;
            }
            even = !even;
        } return true;
    }
}