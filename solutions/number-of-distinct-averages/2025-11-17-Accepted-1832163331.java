/*
 * Submission: 1832163331
 * Problem: Number of Distinct Averages (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:43:25 UTC
 * Runtime: 4 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left =0,right = nums.length-1;
        HashSet<Double> set = new HashSet<>();
        while(left<right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}