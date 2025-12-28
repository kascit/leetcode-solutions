/*
 * Submission: 1706127470
 * Problem: How Many Numbers Are Smaller Than the Current Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:39:40 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] freq = new int[101];
        for (int i : nums){
            freq[i]++;
        }
        int count = 0;
        //System.out.println(Arrays.toString(freq));
        for (int i = 0; i <= 100; i++){
            if (freq[i] == 0) continue;
            int TEMP = freq[i];
            freq[i] = count;
            count += TEMP;

        }
        //System.out.println(Arrays.toString(freq));
        for (int i = 0; i < nums.length; i++){
            ans[i] = freq[nums[i]];
        }
        return ans;
    }
}