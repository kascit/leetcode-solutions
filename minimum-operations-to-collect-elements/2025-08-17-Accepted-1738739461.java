/*
 * Submission: 1738739461
 * Problem: Minimum Operations to Collect Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 16:34:40 UTC
 * Runtime: 2 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int cnt = 0, end = nums.size() - 1;
        Set<Integer> taken = new HashSet<>();
        for (int i = end; i >= 0;  i--){
            int cur = nums.get(i);
            if (cur <= k) taken.add(cur);
            cnt++;
            if (taken.size() == k) return cnt;
        } return -1;
    }
}