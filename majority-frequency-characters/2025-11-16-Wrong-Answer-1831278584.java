/*
 * Submission: 1831278584
 * Problem: Majority Frequency Characters (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-16 11:41:29 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String majorityFrequencyGroup(String s) {
        int freq[] = new int[26], frfr[] = new int[101];
        for (var ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int max = -1;
        for (int f : freq) {
            if (f == 0) continue;
            frfr[f]++;
            if (max == -1 || frfr[f] > frfr[max] && f > max) max = f;
        }
        // System.out.println(Arrays.toString(freq));
        // System.out.println(Arrays.toString(frfr));
        // System.out.println(max);
        StringBuilder ans = new StringBuilder(100);
        for (int i = 0; i < 26; i++) {
            if (freq[i] == max) {
                ans.append((char)('a'+i));
            }
        } return ans.toString();
    }
}