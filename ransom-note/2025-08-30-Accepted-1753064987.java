/*
 * Submission: 1753064987
 * Problem: Ransom Note (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:32:36 UTC
 * Runtime: 2 ms
 * Memory: 44.7 MB
 */

class Solution {
    public boolean canConstruct(String s, String chars) {
        int[] f = new int[26];
        int cl = chars.length();
        int len = s.length();
        if (len > cl) return false;
        for (int i = 0; i < cl; i++) {
            f[chars.charAt(i)-'a']++;
        }
        int[] sl = new int[26];
        for (int i = 0; i < len; i++){
            int cur = s.charAt(i)-'a';
            sl[cur]++;
            if (sl[cur] > f[cur]) return false;
        } return true;
    }
}