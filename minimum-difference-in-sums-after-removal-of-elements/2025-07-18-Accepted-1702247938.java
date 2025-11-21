/*
 * Submission: 1702247938
 * Problem: Minimum Difference in Sums After Removal of Elements (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 09:20:41 UTC
 * Runtime: 183 ms
 * Memory: 81.9 MB
 */

class Solution {
    public long minimumDifference(int[] nums) {
        int len = nums.length;
        int k = len / 3;

        long[] suffixMax = new long[len];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // keep n largest
        long sum = 0;
        for (int i = len - 1; i >= k; i--) {
            sum += nums[i];
            minHeap.offer(nums[i]);
            if (minHeap.size() > k) sum -= minHeap.poll();
            if (minHeap.size() == k) suffixMax[i] = sum;
            else suffixMax[i] = Long.MIN_VALUE;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keep n smallest
        sum = 0;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < 2*k; i++) {
            sum += nums[i];
            maxHeap.offer(nums[i]);
            if (maxHeap.size() > k) sum -= maxHeap.poll();
            if (i >= k-1 && maxHeap.size() == k) {
                long diff = sum - suffixMax[i+1];
                ans = Math.min(ans, diff);
            }
        }

        return ans;
    }
}
