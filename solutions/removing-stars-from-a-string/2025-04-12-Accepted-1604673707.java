/*
 * Submission: 1604673707
 * Problem: Removing Stars From a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 15:15:12 UTC
 * Runtime: 60 ms
 * Memory: 45.6 MB
 */

class Solution {
    public String removeStars(String l) {
        // Create a new stack to keep track of characters encountered so far
        Stack<Character> s = new Stack<>();
        
        // Iterate over each character in the input string
        for (char c : l.toCharArray()) {
            // If the current character is a star, remove the topmost character from the stack
            if (c == '*') {
                s.pop();
            }
            // If the current character is not a star, add it to the stack
            else {
                s.push(c);
            }
        }
        
        // Create a new StringBuilder to store the characters in the stack
        StringBuilder sb = new StringBuilder();
        
        // Iterate over each character in the stack and append it to the StringBuilder
        for (char c : s) {
            sb.append(c);
        }
        
        // Convert the StringBuilder to a string and return it as the output
        return sb.toString();
    }
}