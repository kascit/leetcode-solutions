/*
 * Submission: 1772880230
 * Problem: Replace All ?'s to Avoid Consecutive Repeating Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 15:23:12 UTC
 * Runtime: 1 ms
 * Memory: 42.5 MB
 */

class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i), prev = 0, next = 0;
            if (cur == '?') {
                if (!sb.isEmpty()) {
                    prev = sb.charAt(sb.length()-1);
                }
                if (i < len - 1) {
                    next = s.charAt(i+1);
                }
                for (char ch = 'a' ; ch <= 'z'; ch++) {
                    if (ch == next || ch == prev) continue;
                    sb.append(ch); break;
                }

            } else sb.append(cur);
            // System.out.println(sb.toString());
        } return sb.toString();
    }
}