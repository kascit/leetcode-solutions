/*
 * Submission: 1834055112
 * Problem: Check Array Formation Through Concatenation (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 08:55:47 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] ir = new int[101];
        for (int i = 0; i < arr.length; i++) {
            ir[arr[i]] = i;
        }

        for (int [] p : pieces) {
            int min = -1;
            for (int h : p) {
                if (ir[h] < min) return false;
                min = Math.max(ir[h],min);
            }
        } return true;
     }
}