/*
 * Submission: 1761397136
 * Problem: Find the Encrypted String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:13:42 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public String getEncryptedString(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt((i+k)%len));
        } return sb.toString();
    }
}