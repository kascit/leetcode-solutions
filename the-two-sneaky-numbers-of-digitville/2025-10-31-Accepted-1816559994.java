/*
 * Submission: 1816559994
 * Problem: The Two Sneaky Numbers of Digitville (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-31 05:26:51 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length - 2];
        int[] ans = new int[2];
        int cnt = 0;
        for (int num : nums){
            if (cnt == 2) break;
            freq[num]++;
            if (freq[num] == 2) {
                ans[cnt++] = num;
            }
        }
        return ans;
    }
}