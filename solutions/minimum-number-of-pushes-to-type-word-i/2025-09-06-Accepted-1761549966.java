/*
 * Submission: 1761549966
 * Problem: Minimum Number of Pushes to Type Word I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:19:37 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int len = word.length();
        for (int i = 0; i < len; i++) {
            freq[word.charAt(i)-'a']++;
        }
        int taken = 0;
        int ans = 0;
        int times = 1;
        Arrays.sort(freq);

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            ans += freq[i]*times;
            taken++;
            if (taken%8==0) times++;
        } return ans;
    }
}