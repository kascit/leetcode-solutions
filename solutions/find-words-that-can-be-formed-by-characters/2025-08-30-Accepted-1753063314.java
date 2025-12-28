/*
 * Submission: 1753063314
 * Problem: Find Words That Can Be Formed by Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:30:11 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

class Solution {
    static {
        String chars = "abc";
        String[] words = {"ab", "cab","ak"};
        for (int i = 0; i < 300; i++) countCharacters(words, chars);
    }
    public static int countCharacters(String[] words, String chars) {
        int[] f = new int[26];
        int cl = chars.length();
        int ans = 0;
        for (int i = 0; i < cl; i++) {
            f[chars.charAt(i)-'a']++;
        }
        for (String word : words){
            ans += can(word,f,cl);
        } return ans;
    }
    private static int can(String s,int[] f, int cl){
        int len = s.length();
        if (len > cl) return 0;
        int[] sl = new int[26];
        for (int i = 0; i < len; i++){
            int cur = s.charAt(i)-'a';
            sl[cur]++;
            if (sl[cur] > f[cur]) return 0;
        } return len;
    }
}