/*
 * Submission: 1731061388
 * Problem: Split the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 09:52:54 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int max = 0;
        for(int n : nums){
            max = Math.max(max, n);
        }

        int[] arr = new int[max + 1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>2){
                return false;
            }
        }return true;
    }
}