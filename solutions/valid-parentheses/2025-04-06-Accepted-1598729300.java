/*
 * Submission: 1598729300
 * Problem: Valid Parentheses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:57:15 UTC
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
            } else if( complement(braces.peek()) == ch ){
                braces.pop();
            } else {
                braces.push(ch);
            }
        }
        return braces.isEmpty();
    }
    private char complement(char c){
        switch(c){
            case '(' : return ')';
            case '{' : return '}';
            case '[' : return ']';
            default : return '\0';
        }
    }
}