/*
 * Submission: 1702303398
 * Problem: Goal Parser Interpretation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 10:20:42 UTC
 * Runtime: 1 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <command.length(); i++){
            if (i < command.length() - 1 && command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sb.append('o');
            } else if (command.charAt(i) != '(' && command.charAt(i) != ')'){
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }
}