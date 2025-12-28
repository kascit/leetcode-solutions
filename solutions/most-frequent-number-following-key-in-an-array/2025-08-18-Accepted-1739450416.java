/*
 * Submission: 1739450416
 * Problem: Most Frequent Number Following Key In an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:41:57 UTC
 * Runtime: 1 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq = new int[1001];
        int prev = -1;
        for(int n : nums){
            if (prev == key){
                freq[n]++;
            }
            prev = n;
        }
        int ind = -1, max = 0;
        for(int i = 0; i < 1001; i++){
            if (freq[i] > max){
                ind = i;
                max = freq[i];
            }
        }
        return ind;
    }
}