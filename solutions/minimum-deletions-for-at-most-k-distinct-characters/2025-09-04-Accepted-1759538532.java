/*
 * Submission: 1759538532
 * Problem: Minimum Deletions for At Most K Distinct Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 15:56:19 UTC
 * Runtime: 1 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int minDeletion(String s, int k) {
        int[] fuck = new int[26];
        int len = s.length(), uniq = 0, ans = 0;
        for (int i = 0; i < len; i++) {
            fuck[s.charAt(i)-'a']++;
            if (fuck[s.charAt(i)-'a'] == 1) uniq++;
        }

        while(uniq>k) {
            int min = -1;
            for(int i = 0; i < 26; i++) {
                if (fuck[i] == 0) continue;
                if (min == -1 || fuck[min] > fuck[i]) {
                    min = i;
                }
            }
            ans += fuck[min];
            fuck[min] = 0;
            uniq--;
        } return ans;

    }
}