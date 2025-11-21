/*
 * Submission: 1836041174
 * Problem: License Key Formatting (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 14:11:30 UTC
 * Runtime: 9 ms
 * Memory: 45.5 MB
 */

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length(), t = 0;
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i>=0; i--) {
            char cur = s.charAt(i);
            if (cur == '-') continue;
            if (t==k) {
                sb.append('-');
                t = 0;
            }
            sb.append(Character.toUpperCase(cur));
            t++;
        } 
        return sb.reverse().toString();
    }
}