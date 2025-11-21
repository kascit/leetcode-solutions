/*
 * Submission: 1819236577
 * Problem: Minimum Time to Make Rope Colorful (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-03 05:31:33 UTC
 * Runtime: 40 ms
 * Memory: 84.7 MB
 */

class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Character> color = new Stack<>();
        Stack<Integer> time = new Stack<>();
        int ans = 0;
        int n = neededTime.length;
        color.push(colors.charAt(0));
        time.push(neededTime[0]);
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) != color.peek()) {
                color.push(colors.charAt(i));
                time.push(neededTime[i]);
            } else {
                if (time.peek() > neededTime[i]) {
                    ans+= neededTime[i];
                    continue;
                } else {
                    ans+= time.pop();
                    color.pop();
                    color.push(colors.charAt(i));
                    time.push(neededTime[i]);
                }
            }
        }

        return ans;

    }
}