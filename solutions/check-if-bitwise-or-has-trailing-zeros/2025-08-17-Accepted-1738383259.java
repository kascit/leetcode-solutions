/*
 * Submission: 1738383259
 * Problem: Check if Bitwise OR Has Trailing Zeros (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:19:39 UTC
 * Runtime: 1 ms
 * Memory: 44.1 MB
 */

class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (((nums[i]|nums[j])&1) == 0) return true;
            }
        }
        return false;
    }
}