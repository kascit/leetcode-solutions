/*
 * Submission: 1834289432
 * Problem: Minimum Operations to Convert All Elements to Zero (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 14:20:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for (int n : nums) {
            if (n == 0) continue;
            while(!stack.isEmpty() && stack.peek() > n) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < n) ans++;
            stack.push(n);
        } return ans;
    }
}