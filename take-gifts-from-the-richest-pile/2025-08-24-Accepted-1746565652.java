/*
 * Submission: 1746565652
 * Problem: Take Gifts From the Richest Pile (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:58:35 UTC
 * Runtime: 4 ms
 * Memory: 42.5 MB
 */

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long ans = 0;
        for (int x : gifts) {pq.add(x); ans += x;}
        for (int i = 0; i < k; i++) {
            int cur = pq.poll();
            int n = (int)Math.sqrt(cur);
            pq.offer(n);
            ans += (n - cur);
        }
        // for (int x : pq) {
        //     ans += x;
        // } 
        return ans;
    }
}