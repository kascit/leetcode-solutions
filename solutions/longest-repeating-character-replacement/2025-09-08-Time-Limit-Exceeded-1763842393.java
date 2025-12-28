/*
 * Submission: 1763842393
 * Problem: Longest Repeating Character Replacement (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-09-08 14:08:21 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
        for (char ch : arr) {
            freq[ch - 'A'] = 1;
        }
        int max = 0;
        int l = 0, r = 0, others = 0;
        // System.out.println(Arrays.toString(freq));
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            l = 0; r = 0; others = 0;
            System.out.println((char)'A'+i);
            while(r < len) {
                while(r < len && others < k) {
                    if (arr[r] -'A' != i) {
                        others++;
                    }
                    r++;
                }
                // System.out.println(l+"   "+r);
                int cur = r - l;
                if (r < len && arr[r] - 'A' == i) cur++;
                max = Math.max(max,cur);
                l = r;
                others = 0;
            }
        } max = Math.max(max,r-l);
        return max;
    }
}