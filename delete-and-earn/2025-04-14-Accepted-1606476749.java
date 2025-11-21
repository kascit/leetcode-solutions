/*
 * Submission: 1606476749
 * Problem: Delete and Earn (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 10:27:49 UTC
 * Runtime: 6 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int deleteAndEarn(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        final int[] values = new int[max-min + 1];
        for (int num : nums) {
            values[num-min] += num;
        }
        int take = 0, skip = 0;
        for (final int value : values) {
            final int temp = Math.max(skip + value, take);
            skip = take;
            take = temp;
        }
        return take;
    }
}