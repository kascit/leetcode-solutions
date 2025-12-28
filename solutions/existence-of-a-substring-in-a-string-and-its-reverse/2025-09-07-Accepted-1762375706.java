/*
 * Submission: 1762375706
 * Problem: Existence of a Substring in a String and Its Reverse (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:13:43 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb =  new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            sb.append(s.charAt(i+1));
            sb.append(s.charAt(i));
            if (s.indexOf(sb.toString()) != -1) return true;
            sb.setLength(0);
        } return false;
    }
}