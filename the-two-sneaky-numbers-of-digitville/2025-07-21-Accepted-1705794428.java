/*
 * Submission: 1705794428
 * Problem: The Two Sneaky Numbers of Digitville (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 10:23:04 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
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