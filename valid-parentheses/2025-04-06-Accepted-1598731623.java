/*
 * Submission: 1598731623
 * Problem: Valid Parentheses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:59:33 UTC
 * Runtime: 4 ms
 * Memory: 41.9 MB
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(last, cur)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(cur);
        }

        return stack.isEmpty();        
    }

    private boolean isPair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }    
}