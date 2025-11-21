/*
 * Submission: 1836040464
 * Problem: License Key Formatting (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 14:10:18 UTC
 * Runtime: 10 ms
 * Memory: 45.4 MB
 */

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length(), t = 0;
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i>=0; i--) {
            char cur = s.charAt(i);
            if (cur == '-') continue;
            sb.append(Character.toUpperCase(cur));
            t++;
            if (t==k) {
                sb.append('-');
                t = 0;
            }
        } if (sb.length() > 1 && sb.charAt(sb.length()-1) == '-') sb.setLength(sb.length()-1);
        return sb.reverse().toString();
    }
}