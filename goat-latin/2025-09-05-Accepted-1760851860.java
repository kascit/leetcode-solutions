/*
 * Submission: 1760851860
 * Problem: Goat Latin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:39:45 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder(sentence.length());
        StringBuilder aSuffix = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(convertWordToGoatLatin(words[i]));
            aSuffix.append('a');
            sb.append(aSuffix);
            if (i != words.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    private String convertWordToGoatLatin(String w) {
        char first = w.charAt(0);
        StringBuilder sb = new StringBuilder(w);
        if ("aeiouAEIOU".indexOf(first) != -1) {
            sb.append("ma");
        } else {
            sb.append(first);
            sb.deleteCharAt(0);
            sb.append("ma");
        }
        return sb.toString();
    }
}
