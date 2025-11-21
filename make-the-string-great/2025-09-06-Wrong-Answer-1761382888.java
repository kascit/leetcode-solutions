/*
 * Submission: 1761382888
 * Problem: Make The String Great (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-06 10:56:25 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String makeGood(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            int slen = sb.length() ;
            if (cur < 97 && slen > 0) {
                if (sb.charAt(slen-1) == cur + 32) {
                    sb.deleteCharAt(slen-1);
                    continue;
                }
            } sb.append(cur);
        } return sb.toString();
    }
}