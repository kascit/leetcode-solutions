/*
 * Submission: 1762411701
 * Problem: Maximum Length Substring With Two Occurrences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:55:19 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int left = 0, ans = 0;
        int overLimit = 0;

        for (int right = 0; right < n; right++) {
            int idx = s.charAt(right) - 'a';
            freq[idx]++;
            if (freq[idx] == 3) overLimit++;

            while (overLimit > 0) {
                int li = s.charAt(left) - 'a';
                if (freq[li] == 3) overLimit--;
                freq[li]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
