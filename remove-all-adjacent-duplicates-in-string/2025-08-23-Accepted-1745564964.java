/*
 * Submission: 1745564964
 * Problem: Remove All Adjacent Duplicates In String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:55:46 UTC
 * Runtime: 10 ms
 * Memory: 45.6 MB
 */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char ch : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len-1) == ch) {
                sb.deleteCharAt(len-1);
            } else {
                sb.append(ch);
            }
        } return sb.toString();
    }
}