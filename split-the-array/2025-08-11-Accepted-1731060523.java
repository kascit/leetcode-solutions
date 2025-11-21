/*
 * Submission: 1731060523
 * Problem: Split the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 09:51:53 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>2){
                return false;
            }
        }return true;
    }
}