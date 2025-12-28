/*
 * Submission: 1761529727
 * Problem: Reformat Phone Number (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-06 13:57:02 UTC
 * Runtime: N/A
 * Memory: N/A
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
            if (c == 3 && i < len - 3) {
                sb.append('-');
                c = 0;
            }
        }
        if (c >= 4) sb.insert(sb.length()-2,'-');
        return sb.toString();
    }
}