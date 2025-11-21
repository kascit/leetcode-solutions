/*
 * Submission: 1707236332
 * Problem: Longest Unequal Adjacent Groups Subsequence I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 13:06:46 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int first = groups[0];
        ans.add(words[0]);
        for (int i = 1; i < groups.length; i++){
            if (groups[i] != first) {
                first = groups[i];
                ans.add(words[i]);
            }
        }
        return ans;
    }
}