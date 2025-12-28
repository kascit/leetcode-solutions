/*
 * Submission: 1761541916
 * Problem: Calculate Digit Sum of a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:10:41 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    public String digitSum(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len/k+k);
        while ((len = s.length()) > k) {
            int num = 0, c  = 0;
            for (int i = 0; i < len; i++) {
                num += s.charAt(i) - '0';
                c++;
                if(c == k) {
                    // System.out.println(num);
                    sb.append(num);
                    num = 0;
                    c = 0;
                }
            }
            if (c != 0) sb.append(num);
            s = sb.toString();
            sb.setLength(0);
            // System.out.println(s);
        } return s;
    }
}