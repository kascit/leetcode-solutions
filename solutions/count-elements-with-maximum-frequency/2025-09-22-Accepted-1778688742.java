/*
 * Submission: 1778688742
 * Problem: Count Elements With Maximum Frequency (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-22 04:42:19 UTC
 * Runtime: 1 ms
 * Memory: 42 MB
 */

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        for (int i=0; i < nums.length; i++) {
            if(max < nums[i]) max = nums[i];
        }

        int[] count = new int[max + 1];        
        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if(count[nums[i]] > maxFreq) maxFreq = count[nums[i]];
        }
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            if (maxFreq == count[i]) sum+=count[i];
        }

        return sum;
    }
}