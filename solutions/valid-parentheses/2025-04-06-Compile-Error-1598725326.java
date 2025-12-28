/*
 * Submission: 1598725326
 * Problem: Valid Parentheses (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-06 16:53:08 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();
        char[] argh = s.toCharArray();
        for(char ch : argh){
            if (ch == '(' || ch == '{' || ch == '[' ){
                braces.push(ch);
            }
            else if(complement(braces.peek()) == ch){
                braces.pop();
            }
        }
        return braces.isEmpty();
    }
    private char complement(char c){
        switch(c){
            case '(' : return ')';
            case '{' : return '}';
            case '[' : return ']';
            default : return '';
        }
    }
}