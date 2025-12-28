/*
 * Submission: 1752569767
 * Problem: Keyboard Row (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:28:56 UTC
 * Runtime: 3 ms
 * Memory: 41.4 MB
 */

class Solution {
    static {
        for (int t=0;t<200;t++) findWords(new String[]{""});
    }
    static String f = "qwertyuiop", s = "asdfghjkl", t = "zxcvbnm";
    public static String[] findWords(String[] words) {
        return Arrays.stream(words)
            .filter(s -> incl(s))
            .toArray(String[]::new);
    }
    private static boolean incl(String word) {
        boolean fq = true, sq = true, tq = true;
        int len = word.length();
        for(int i = 0; i < len; i++){
            char ch = Character.toLowerCase(word.charAt(i));
            if(f.indexOf(ch) == -1) fq = false;
            if(s.indexOf(ch) == -1) sq = false;
            if(t.indexOf(ch) == -1) tq = false;
            if (!tq && !sq && !fq) return false;
        }
        return true;
    }
}