/*
 * Submission: 1605731615
 * Problem: Daily Temperatures (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 15:27:00 UTC
 * Runtime: 73 ms
 * Memory: 62.7 MB
 */

class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}