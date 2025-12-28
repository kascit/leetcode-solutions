/*
 * Submission: 1711085898
 * Problem: Permutation Difference between Two Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 14:28:10 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] d = new int[26];
        int n = s.length();
        for(int i = 0; i< n; i++){
            d[s.charAt(i) - 'a'] = i;
        }
        int ans = 0;
        for(int i = 0; i< n; i++){
            ans += Math.abs(d[t.charAt(i) - 'a'] - i);
        }
        return ans;
    }
}