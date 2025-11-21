/*
 * Submission: 1746489531
 * Problem: Minimum String Length After Removing Substrings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:35:45 UTC
 * Runtime: 3 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int minLength(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            int sbl = sb.length();
            if (sbl > 0){
                if (cur == 'B' && sb.charAt(sbl - 1) == 'A') {
                    sb.deleteCharAt(sbl - 1);
                    continue;
                }
                if (cur == 'D' && sb.charAt(sbl - 1) == 'C') {
                    sb.deleteCharAt(sbl - 1);
                    continue;
                }
            }
            sb.append(cur);
        } return sb.length();
    }
}