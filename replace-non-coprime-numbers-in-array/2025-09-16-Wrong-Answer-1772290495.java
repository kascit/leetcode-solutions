/*
 * Submission: 1772290495
 * Problem: Replace Non-Coprime Numbers in Array (Hard)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-16 04:26:26 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            if (st.isEmpty()) {
                st.push(cur);
            } else {
                int prev = st.pop();
                int gcd = gcd(prev,cur);
                if (gcd == 1) {
                    ans.add(prev);
                    st.push(cur);
                } else {
                    long lcm = prev*cur/gcd;
                    st.push((int)lcm);
                }
            }
        } 
        if (!st.isEmpty()) ans.add(st.pop());
        
        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}