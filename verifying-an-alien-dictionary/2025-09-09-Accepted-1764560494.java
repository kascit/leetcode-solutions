/*
 * Submission: 1764560494
 * Problem: Verifying an Alien Dictionary (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 05:24:43 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] o = new int[26];
        int len = order.length();
        for (int i = 0; i < len; i++) {
            o[order.charAt(i)-'a'] = i;
        }
        int c = words.length;
        for (int i = 0; i < c - 1; i++) {
            int j = 0;
            int wlen = Math.min(words[i].length(),words[i+1].length());
            while (
                j < wlen 
                &&
                o[words[i+1].charAt(j)-'a'] == o[words[i].charAt(j)-'a']
            ) {
                j++;
            }
            if (j == wlen && words[i].length() > words[i+1].length()) return false;
            if (j < wlen && o[words[i+1].charAt(j)-'a'] < o[words[i].charAt(j)-'a'] ) return false;
        } return true;
    }
}