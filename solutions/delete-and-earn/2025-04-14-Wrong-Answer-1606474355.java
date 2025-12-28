/*
 * Submission: 1606474355
 * Problem: Delete and Earn (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-14 10:24:36 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int deleteAndEarn(int[] nums) {
        final Map<Integer, Integer> values = new HashMap<>();
        for (final int num : nums) {
            values.put(num, values.getOrDefault(num, 0) + num);
        }
        int pre = 0, cur = 0;
        for (final int num : values.keySet()) {
            if (!values.containsKey(num - 1)) {
                pre = cur;
                cur += values.get(num);
            } else {
                final int temp = Math.max(pre + values.get(num), cur);
                pre = cur;
                cur = temp;
            }
        }
        return cur;
    }
}