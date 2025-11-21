/*
 * Submission: 1761383812
 * Problem: Make The String Great (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:57:31 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public String makeGood(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            int slen = sb.length() ;
            if (slen > 0) {
                if (Math.abs(sb.charAt(slen-1) - cur) ==32) {
                    sb.deleteCharAt(slen-1);
                    continue;
                }
            } sb.append(cur);
        } return sb.toString();
    }
}