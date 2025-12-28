/*
 * Submission: 1746563322
 * Problem: Take Gifts From the Richest Pile (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:56:03 UTC
 * Runtime: 5 ms
 * Memory: 42.8 MB
 */

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : gifts) pq.add(x);
        for (int i = 0; i < k; i++) {
            int cur = pq.poll();
            pq.offer((int)Math.sqrt(cur));
        }
        long ans = 0;
        for (int x : pq) {
            ans += x;
        } return ans;
    }
}