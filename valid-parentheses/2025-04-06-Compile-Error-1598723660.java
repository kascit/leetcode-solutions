/*
 * Submission: 1598723660
 * Problem: Valid Parentheses (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-06 16:51:27 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isValid(String s) {
        Stack<char> braces = new Stack<>();
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