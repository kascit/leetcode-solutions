/*
 * Submission: 1828419312
 * Problem: Maximum Number of Operations to Move Ones to the End (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 04:59:13 UTC
 * Runtime: 8 ms
 * Memory: 47.9 MB
 */

class Solution {
    public int maxOperations(String s) {
        int len = s.length();
        // Stack<Integer> st = new Stack<>();
        int size = 0, ans = 0;
        boolean sawZ = false;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == '0') {
                sawZ = true;
            }
            if(s.charAt(i) == '1' || i == len - 1) {
                if (sawZ) {
                    // ans += st.size();
                    ans += size;
                    sawZ = false;
                } else {
                    // st.push(1);
                }
                size++;
            }
            // System.out.println(size+"  "+ans+"  "+i);

        } return ans;
    }
}