/*
 * Submission: 1761535198
 * Problem: Reformat Phone Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:03:05 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    public String reformatNumber(String number) {
        int len = number.length(), c= 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char cur = number.charAt(i);
            if (Character.isDigit(cur)){
                sb.append(cur);
                c++;
            }
            if (c == 3) {
                sb.append('-');
                c = 0;
            }
        }
        int slen = sb.length();
        if (sb.charAt(slen-2) == '-') {
            sb.deleteCharAt(slen-2);
            sb.insert(slen-3,'-');
        }
        if (sb.charAt(slen-1) == '-') {
            sb.deleteCharAt(slen-1);
        }
        return sb.toString();
    }
}