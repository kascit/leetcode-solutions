/*
 * Submission: 1598724543
 * Problem: Valid Parentheses (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-06 16:52:21 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();
        char[] argh = s.toCharArray();
        for(char ch : argh){
            if (ch == '(' || ch == '{' || ch == '[' ){
                argh.push(ch);
            }
            else if(complement(braces.peek()) == ch){
                braces.pop();
            }
        }
        return argh.isEmpty();
    }
    private char complement(char c){
        switch(c){
            case '(' : return ')';
            case '{' : return '}';
            case '[' : return ']';
        }
    }
}