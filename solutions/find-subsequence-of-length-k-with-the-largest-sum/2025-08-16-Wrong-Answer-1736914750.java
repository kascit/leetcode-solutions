/*
 * Submission: 1736914750
 * Problem: Find Subsequence of Length K With the Largest Sum (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-16 06:33:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getKey(), b.getKey()));
        for (int i = 0; i < nums.length; i++){
            pq.offer(new Pair<>(nums[i], i));
            if (pq.size() > k) pq.poll();
        }
        int sum = 0;
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().getKey();
        }
        // System.out.println(sum);
         return ans;
    }
}