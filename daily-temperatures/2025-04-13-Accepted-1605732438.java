/*
 * Submission: 1605732438
 * Problem: Daily Temperatures (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 15:28:02 UTC
 * Runtime: 23 ms
 * Memory: 60.2 MB
 */




class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; --i) {
            int currTemperature = temperatures[i];

            while (!stack.isEmpty() && currTemperature >= temperatures[stack.peekLast()]) {
                stack.pollLast();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peekLast() - i;
            }

            stack.offerLast(i);
        }

        return result;
    }
}

