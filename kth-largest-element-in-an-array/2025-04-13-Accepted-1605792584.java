/*
 * Submission: 1605792584
 * Problem: Kth Largest Element in an Array (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 16:43:43 UTC
 * Runtime: 10 ms
 * Memory: 59.6 MB
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int minValue = Arrays.stream(nums).min().getAsInt();
        int maxValue = Arrays.stream(nums).max().getAsInt();

        int[] count = new int[maxValue - minValue + 1];

        for (int num : nums) {
            count[num - minValue]++;
        }

        int remaining = k;
        for (int i = count.length - 1; i >= 0; i--) {
            remaining -= count[i];

            if (remaining <= 0) {
                return i + minValue;
            }
        }

        return -1; // This line should not be reached        
    }
}