/*
 * Submission: 1760850603
 * Problem: Goat Latin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:38:04 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    String vow = "aeiouAEIOU";
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder(sentence.length());
        int len = words.length;
        for (int i = 0; i < len; i++) {
            sb.append(shite(words[i]));
            sb.append("a".repeat(i+1));
            if (i != len - 1) sb.append(" ");
        } return sb.toString();
    }

    private String shite(String w) {
        StringBuilder sb = new StringBuilder(w);
        if (vow.indexOf(w.charAt(0)) != -1) {
            sb.append("ma");
        } else {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            sb.append("ma");
        }
        return sb.toString(); 
    }
}