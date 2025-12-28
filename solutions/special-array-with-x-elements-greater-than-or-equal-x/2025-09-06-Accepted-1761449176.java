/*
 * Submission: 1761449176
 * Problem: Special Array With X Elements Greater Than or Equal X (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:19:56 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    static {
        for(int i=0;i<300;i++){
            int[] arr = {};
            specialArray(arr);
        }
    }
    public static int specialArray(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(i<=nums[j]) count++;
            }
            if(count==i) return i;
        }
        return -1;
    }
}