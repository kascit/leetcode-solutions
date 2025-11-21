/*
 * Submission: 1606452644
 * Problem: Remove Element (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:55:38 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0, r = 0;
        while(l<n){
            while(l<n && nums[l] != val){
                l++;
            }
            while(r<n && (nums[r] == val || r < l)){
                r++;
            }
            if (l < n && r < n){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            } else break;

        }
        return l;
    }
}