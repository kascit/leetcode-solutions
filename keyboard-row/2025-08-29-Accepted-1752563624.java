/*
 * Submission: 1752563624
 * Problem: Keyboard Row (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:22:51 UTC
 * Runtime: 2 ms
 * Memory: 41.4 MB
 */

class Solution {
    public String[] findWords(String[] words) {
        return Arrays.stream(words)
            .filter(s -> incl(s))
            .toArray(String[]::new);
    }
    private boolean incl(String word) {
        String f = "qwertyuiop", s = "asdfghjkl", t = "zxcvbnm";
        boolean fq = true, sq = true, tq = true;
        for(char ch : word.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(f.indexOf(ch) == -1) fq = false;
            if(s.indexOf(ch) == -1) sq = false;
            if(t.indexOf(ch) == -1) tq = false;
        }
        return fq || sq || tq;
    }
}