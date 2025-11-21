/*
 * Submission: 1746496597
 * Problem: Divide a String Into Groups of Size k (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 10:43:12 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        String[] ans = new String[(len+2)/3];
        int cur = 0, idx = 0;
        StringBuilder sb = new StringBuilder(k);
        for (int i = 0; i < len; i++) {
            if (cur < k) {
                sb.append(s.charAt(i));
                cur++;
            }
            if (cur == k) {
                ans[idx++] = sb.toString();
                sb.setLength(0);
                cur = 0;
            }
        
            if (i == len - 1 && cur > 0) {
                while (cur < k) {
                    sb.append(fill);
                    cur++;
                }
                ans[idx++] = sb.toString();
                sb.setLength(0);
            }
        } return ans;
    }
}