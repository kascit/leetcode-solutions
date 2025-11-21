/*
 * Submission: 1761453106
 * Problem: Last Stone Weight (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-06 12:25:01 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            pq.offer(s);
        }
        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            if (x==y) continue;
            pq.offer(x-y);
        } return pq.peek();
    }
}