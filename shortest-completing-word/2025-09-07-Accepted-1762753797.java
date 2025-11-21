/*
 * Submission: 1762753797
 * Problem: Shortest Completing Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 14:32:49 UTC
 * Runtime: 2 ms
 * Memory: 44.9 MB
 */

class Solution {
    int[] freq;
    public String shortestCompletingWord(String licensePlate, String[] words) {
        freq = new int[26];
        int len = licensePlate.length();
        for (int i = 0; i < len; i++) {
            char cur = licensePlate.charAt(i);
            if (!Character.isLetter(cur)) continue;
            if (cur < 97) {
                freq[cur-65]++;
            } else freq[cur-97]++;
        }
        String ans = "";
        len = -1;
        // System.out.println(Arrays.toString(freq));
        for (String word : words) {
            int wlen = word.length();
            if (isCorrect(word,wlen)) {
                if (len == -1 || wlen < len) {
                    ans = word;
                    len = wlen;
                }
            }
        } return ans;
    }
    private boolean isCorrect(String word,int wlen) {
        int[] wreck = new int[26];
                // System.out.println(word);

        for (int i = 0; i < wlen; i++) {
            int idx = word.charAt(i)-'a';
            wreck[idx]++;
        } 
        for (int i = 0; i < 26; i++) {
            if (wreck[i] < freq[i]) return false;
        }
        return true;
    }
}