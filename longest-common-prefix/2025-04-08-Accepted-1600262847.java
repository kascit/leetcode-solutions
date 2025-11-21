/*
 * Submission: 1600262847
 * Problem: Longest Common Prefix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-08 05:06:31 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) while (
            strs[i].indexOf(prefix) != 0
        ) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}