/*
 * Submission: 1701468440
 * Problem: Reduce Array Size to The Half (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 15:54:19 UTC
 * Runtime: 38 ms
 * Memory: 60.5 MB
 */

class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(freq.values());

        int half = arr.length / 2;
        int count = 0;
        while (half > 0) {
            half -= pq.poll();  
            count++;
        }

        return count;
    }
}
