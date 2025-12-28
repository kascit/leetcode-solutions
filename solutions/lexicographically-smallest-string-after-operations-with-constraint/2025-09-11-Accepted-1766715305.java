/*
 * Submission: 1766715305
 * Problem: Lexicographically Smallest String After Operations With Constraint (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-11 04:09:30 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
 */

class Solution {
    public String getSmallestString(String s, int k) {
        if (k == 0) return s;
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (cur == 'a' || k == 0) {
                sb.append(cur);
            } else {
                if (canMakeA(cur,k)) {
                    sb.append('a');
                    k -= Math.min(cur-'a','z'-cur+1);
                } else {
                    sb.append((char)(cur-k));
                    k = 0;
                }
            }
            // System.out.println(k);
        }  return sb.toString();
    }
    private boolean canMakeA(char ch, int dis) {
        int cur = ch -'a';
        if (cur == 0) return true;
        if (cur - dis <= 0 || cur + dis > 25) return true;
        return false;
    }
}