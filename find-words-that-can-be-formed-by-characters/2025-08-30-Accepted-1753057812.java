/*
 * Submission: 1753057812
 * Problem: Find Words That Can Be Formed by Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:22:14 UTC
 * Runtime: 2 ms
 * Memory: 45.1 MB
 */

class Solution {
    int[] f = new int[26];
    int cl;
    public int countCharacters(String[] words, String chars) {
        cl = chars.length();
        int ans = 0;
        for (int i = 0; i < cl; i++) {
            f[chars.charAt(i)-'a']++;
        }
        for (String word : words){
            ans += can(word);
        } return ans;
    }
    private int can(String s){
        int len = s.length();
        if (len > cl) return 0;
        int[] sl = new int[26];
        for (int i = 0; i < len; i++){
            sl[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sl[i] > f[i]) return 0;
        } return len;
    }
}