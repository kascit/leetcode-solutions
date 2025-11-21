/*
 * Submission: 1760854682
 * Problem: Goat Latin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:43:31 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.length());
        int n = sentence.length();
        int wordCount = 0, i = 0;

        while (i < n) {
            int next = sentence.indexOf(' ', i);
            if (next == -1) next = n;

            char first = sentence.charAt(i);
            if (isVowel(first)) {
                sb.append(sentence, i, next).append("ma");
            } else {
                sb.append(sentence, i + 1, next).append(first).append("ma");
            }

            for (int j = 0; j <= wordCount; j++) sb.append('a');
            wordCount++;

            if (next < n) sb.append(' ');
            i = next + 1;
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
}
