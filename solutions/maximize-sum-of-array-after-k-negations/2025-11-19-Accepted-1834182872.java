/*
 * Submission: 1834182872
 * Problem: Maximize Sum Of Array After K Negations (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 12:02:29 UTC
 * Runtime: 6 ms
 * Memory: 44.2 MB
 */

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) pq.offer(n);

        for (int i = 0; i < k; i++) {
            int x = pq.poll();
            pq.offer(-x);
        }

        int sum = 0;
        while (!pq.isEmpty()) sum += pq.poll();
        return sum;
    }
}
