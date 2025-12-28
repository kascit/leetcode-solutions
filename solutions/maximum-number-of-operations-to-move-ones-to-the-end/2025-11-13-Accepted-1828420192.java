/*
 * Submission: 1828420192
 * Problem: Maximum Number of Operations to Move Ones to the End (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 05:00:29 UTC
 * Runtime: 7 ms
 * Memory: 47.4 MB
 */

class Solution {
    public int maxOperations(String s) {
        int len = s.length();
        // Stack<Integer> st = new Stack<>();
        int size = 0, ans = 0;
        boolean sawZ = false;
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur == '0') {
                sawZ = true;
            }
            if(cur == '1' || i == len - 1) {
                if (sawZ) {
                    // ans += st.size();
                    ans += size;
                    sawZ = false;
                }
                size++;
            }
            // System.out.println(size+"  "+ans+"  "+i);

        } return ans;
    }
}