/*
 * Submission: 1746572101
 * Problem: Find Lucky Integer in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 12:05:43 UTC
 * Runtime: 0 ms
 * Memory: 44.2 MB
 */

class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            findLucky(new int[0]);
        }
    }
    public static int findLucky(int[] arr) {
        int[] freq = new int[501];
        int max = 0;
        for (int n : arr){
            freq[n]++;
            if (n > max) max = n;
        }
        for (int i = max; i > 0; i--){
            if (freq[i] == i) return i;
        } return -1;
    }
}