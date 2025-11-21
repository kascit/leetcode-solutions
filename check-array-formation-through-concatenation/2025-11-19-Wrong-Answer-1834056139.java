/*
 * Submission: 1834056139
 * Problem: Check Array Formation Through Concatenation (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 08:57:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] ir = new int[101];
        for (int i = 1; i < arr.length + 1; i++) {
            ir[arr[i-1]] = i;
        }

        for (int [] p : pieces) {
            int min = -1;
            for (int h : p) {
                if (ir[h] < min || ir[h] == 0) return false;
                min = Math.max(ir[h],min);
            }
        } return true;
     }
}