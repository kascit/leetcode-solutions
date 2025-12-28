/*
 * Submission: 1724524190
 * Problem: Remove Outermost Parentheses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:08:29 UTC
 * Runtime: 8 ms
 * Memory: 42.3 MB
 */

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}