/*
 * Submission: 1761344655
 * Problem: Remove Letter To Equalize Frequency (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:10:22 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        int len = word.length();
        for (int i = 0; i < len ; i++) {
            freq[word.charAt(i)-'a']++;
        }
        int fr = -1, sr = -1, fc = 0, sc = 0;
        // System.out.println(Arrays.toString(freq));
        for (int f : freq) {
            // System.out.println(f+"   "+fr+"   "+sr);
            if (f == 0) continue;
            if (fr == -1 || fr == f) {
                fr = f;
                fc++;
            }
            else if (sr == -1 || sr == f) {
                sr = f;
                sc++;
            }
            else return false;
        }
        // System.out.println("hehe");
        if (fr == 1 && sr == -1) return true;
        if (fr != -1 && sr == -1 && fc == 1) return true;
        return (fr-sr == 1 && fc == 1) || (sr-fr == 1 && sc == 1) || (sr == 1 && sc == 1|| fr == 1 && fc == 1);
    }
}