/*
 * Submission: 1746497264
 * Problem: Divide a String Into Groups of Size k (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:43:54 UTC
 * Runtime: 1 ms
 * Memory: 42.6 MB
 */

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        String[] ans = new String[(len+k-1)/k];
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