/*
 * Submission: 1834292338
 * Problem: Minimum Operations to Convert All Elements to Zero (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 14:24:08 UTC
 * Runtime: 33 ms
 * Memory: 123.3 MB
 */

class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for (int n : nums) {
            if (n == 0) {stack.clear();continue;}
            while(!stack.isEmpty() && stack.peek() > n) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < n) {
                stack.push(n);
                ans++; 
            }

        } return ans;
    }
}