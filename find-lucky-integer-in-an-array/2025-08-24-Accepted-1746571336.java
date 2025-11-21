/*
 * Submission: 1746571336
 * Problem: Find Lucky Integer in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 12:04:54 UTC
 * Runtime: 1 ms
 * Memory: 43.9 MB
 */

class Solution {
    public int findLucky(int[] arr) {
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