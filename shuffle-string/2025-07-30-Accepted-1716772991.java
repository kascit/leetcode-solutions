/*
 * Submission: 1716772991
 * Problem: Shuffle String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 07:19:33 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] ans = new char[len];
        for (int i = 0; i < len; i++){
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}