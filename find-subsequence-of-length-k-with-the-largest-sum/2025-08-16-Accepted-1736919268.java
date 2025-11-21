/*
 * Submission: 1736919268
 * Problem: Find Subsequence of Length K With the Largest Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 06:38:08 UTC
 * Runtime: 9 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getKey(), b.getKey()));
        for (int i = 0; i < nums.length; i++){
            pq.offer(new Pair<>(nums[i], i));
            if (pq.size() > k) pq.poll();
        }
        List<Pair<Integer,Integer>> list = new ArrayList<>(pq);
list.sort((a,b) -> Integer.compare(a.getValue(), b.getValue()));
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }
        // System.out.println(sum);
         return ans;
    }
}