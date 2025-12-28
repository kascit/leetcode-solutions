/*
 * Submission: 1716774853
 * Problem: Shuffle String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 07:21:29 UTC
 * Runtime: 1 ms
 * Memory: 44.7 MB
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}