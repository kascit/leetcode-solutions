/*
 * Submission: 1772808511
 * Problem: Replace Non-Coprime Numbers in Array (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 14:17:00 UTC
 * Runtime: 16 ms
 * Memory: 65.2 MB
 */

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int top = -1, len = nums.length;
        int[] stack = new int[len+1];
        List<Integer> ans = new ArrayList<>();
        for (int n : nums) {
            long cur = n;
            while (top >= 0) {
                int prev = stack[top];
                int g = gcd((int)cur, prev);
                if (g == 1) break;
                top--;
                cur = (cur * prev) / g;
            }
            stack[++top] = (int)cur;
        }
        for (int i = 0; i <= top; i++) ans.add(stack[i]);
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}