/*
 * Submission: 1701461146
 * Problem: Reduce Array Size to The Half (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 15:47:54 UTC
 * Runtime: 43 ms
 * Memory: 61.7 MB
 */

class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(mp.entrySet());
        int m = pq.size();
        int e = 0;
        while (e < n/2) {
            e += pq.poll().getValue();
        }

        return m - pq.size();

    }
}