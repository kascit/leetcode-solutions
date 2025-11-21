/*
 * Submission: 1716775300
 * Problem: Shuffle String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 07:21:58 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++){
            ans[indices[i]] = s.charAt(i);
        }
        String s1 = new String(ans);
        return s1;
    }
}