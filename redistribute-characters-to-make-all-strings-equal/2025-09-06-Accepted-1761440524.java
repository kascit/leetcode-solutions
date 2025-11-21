/*
 * Submission: 1761440524
 * Problem: Redistribute Characters to Make All Strings Equal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:08:25 UTC
 * Runtime: 2 ms
 * Memory: 43.1 MB
 */

class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for (String w : words) {
            int len = w.length();
            for (int i = 0; i < len; i++) {
                freq[w.charAt(i)-'a']++;
            }
        }
        int d = words.length;
        for (int f : freq) {
            if (f == 0) continue;
            if (f%d != 0) return false;
        } return true;
    }
}