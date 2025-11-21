/*
 * Submission: 1746550864
 * Problem: Make Two Arrays Equal by Reversing Subarrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:42:01 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = target.length;
        int[] freq = new int[1001];
        for (int i = 0; i < len; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        } 
        for (int f : freq) {
            if (f != 0) return false;
        } return true;
    }
}