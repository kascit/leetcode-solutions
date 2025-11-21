/*
 * Submission: 1605788469
 * Problem: Kth Largest Element in an Array (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 16:38:57 UTC
 * Runtime: 39 ms
 * Memory: 57.1 MB
 */

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
}