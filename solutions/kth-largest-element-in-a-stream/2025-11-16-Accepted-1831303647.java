/*
 * Submission: 1831303647
 * Problem: Kth Largest Element in a Stream (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:19:14 UTC
 * Runtime: 22 ms
 * Memory: 52.3 MB
 */

class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int n : nums) {
            add(n);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) pq.poll();
        return pq.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */