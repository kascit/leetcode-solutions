/*
 * Submission: 1755005940
 * Problem: First Unique Character in a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 17:01:58 UTC
 * Runtime: 4 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] idx = new int[26];
        int[] freq = new int[26];
        Arrays.fill(idx, -1);
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int c = arr[i]-'a';
            if(idx[c] == -1) {
                idx[c] = i;
            }
            freq[c]++;
        }
        int ans = (int) 1e5 + 1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                ans = Math.min(ans,idx[i]);
            }
        }
        ans = (ans == (int)1e5+1) ? -1 : ans;
        return ans;
    }
}