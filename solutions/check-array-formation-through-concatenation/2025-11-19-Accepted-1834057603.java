/*
 * Submission: 1834057603
 * Problem: Check Array Formation Through Concatenation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:59:13 UTC
 * Runtime: 0 ms
 * Memory: 43.7 MB
 */

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] pos = new int[101];
        for (int i = 0; i < arr.length; i++) pos[arr[i]] = i + 1;

        for (int[] p : pieces) {
            int start = pos[p[0]];
            if (start == 0) return false;
            int idx = start - 1;

            for (int i = 0; i < p.length; i++) {
                if (idx + i >= arr.length || arr[idx + i] != p[i]) return false;
            }
        }
        return true;
    }
}
