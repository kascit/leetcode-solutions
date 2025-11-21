/*
 * Submission: 1598733805
 * Problem: Valid Parentheses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 17:01:47 UTC
 * Runtime: 2 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();
        char[] argh = s.toCharArray();
        for(char ch : argh){
            if (ch == '(' || ch == '{' || ch == '[' ){
                braces.push(ch);
            }
            else if( braces.isEmpty() ){
                return false;
            } else if( isPair(braces.peek(),ch) ){
                braces.pop();
                continue;
            } else {
                braces.push(ch);
            }
        }
        return braces.isEmpty();
    }
    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }
}