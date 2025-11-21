/*
 * Submission: 1730268473
 * Problem: Clear Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:34:07 UTC
 * Runtime: 2 ms
 * Memory: 43.1 MB
 */

class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()){
            if (Character.isLetter(ch)){
                st.push(ch);
            } else {
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        } return sb.reverse().toString();
    }
}