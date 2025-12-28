/*
 * Submission: 1604654688
 * Problem: Removing Stars From a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 15:04:39 UTC
 * Runtime: 87 ms
 * Memory: 46.7 MB
 */

class Solution {
    public String removeStars(String s) {
        Stack<Character> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '*') str.push(c);
            else if (!str.isEmpty()) str.pop();
        }
        while(!str.isEmpty()) sb.append(str.pop());
        return sb.reverse().toString();
    }
}