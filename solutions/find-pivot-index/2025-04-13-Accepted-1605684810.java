/*
 * Submission: 1605684810
 * Problem: Find Pivot Index (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:27:35 UTC
 * Runtime: 1 ms
 * Memory: 46.1 MB
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        for (int i = 0,r = nums.length - 1; i < nums.length; i++, r--){
            if (i != 0) pre[i] += pre[i-1] + nums[i-1];
            if (r != nums.length - 1) post[r] += post[r+1] + nums[r+1];
        }
        for (int i = 0; i < nums.length; i++){
            if (pre[i] == post[i]) return i;
        }
        return -1;
    }
}