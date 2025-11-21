/*
 * Submission: 1711085456
 * Problem: Permutation Difference between Two Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 14:27:46 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] freq = new int[26];
        int len = s.length(),sum = 0;
        for (int i = 0; i < len; i++){
            freq[s.charAt(i) - 'a'] += i;
            freq[t.charAt(i) - 'a'] -= i;
        }
        for (int i : freq){
            sum += (i>=0) ? i : -1*i ;
        }
        return sum;
    }
}