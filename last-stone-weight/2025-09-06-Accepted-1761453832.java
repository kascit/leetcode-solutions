/*
 * Submission: 1761453832
 * Problem: Last Stone Weight (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:25:58 UTC
 * Runtime: 1 ms
 * Memory: 41.4 MB
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
        } return (pq.peek() != null) ? pq.peek() : 0;
    }
}