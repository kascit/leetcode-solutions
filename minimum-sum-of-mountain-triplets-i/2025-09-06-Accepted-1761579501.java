/*
 * Submission: 1761579501
 * Problem: Minimum Sum of Mountain Triplets I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:52:07 UTC
 * Runtime: 2 ms
 * Memory: 42.5 MB
 */

class Solution {
    public int minimumSum(int[] nums) {
        int len = nums.length;
        Stack<Integer> mono = new Stack<>();
        int[] smallerP = new int[len];
        int[] smallerN = new int[len];
        mono.push(-1);
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            while(!mono.isEmpty() && mono.peek() >= cur) {
                mono.pop();
            }
            int peek = mono.peek();
            smallerP[i] = peek;
            if (peek == -1 || peek > cur) mono.push(cur);
        }
        // System.out.println(Arrays.toString(smallerP));
        mono.clear();
        mono.push(-1);

        for (int i = len - 1; i >= 0; i--) {
            int cur = nums[i];
            while(!mono.isEmpty() && mono.peek() >= cur) {
                mono.pop();
            }
            int peek = mono.peek();
            smallerN[i] = peek;
            if (peek == -1 || peek > cur) mono.push(cur);
        }
        // System.out.println(Arrays.toString(smallerN));
        int ans = 151;
        for (int i = 0; i < len; i++) {
            if (smallerP[i] == -1) continue;
            if (smallerN[i] == -1) continue;
            ans = Math.min(ans,nums[i]+smallerP[i]+smallerN[i]);
        }
        if (ans == 151) return -1;
        return ans;
    }
}