/*
 * Submission: 1716732396
 * Problem: Count Good Triplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 06:41:22 UTC
 * Runtime: 10 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length, count = 0;
        for (int i = 0; i < len - 2; i++)
            for (int j = i+1; j < len - 1; j++){
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j+1; k < len; k++){
                        if (Math.abs(arr[k] - arr[j]) <= b &&  Math.abs(arr[k] - arr[i]) <= c) {
                            count++;
                        }
                    }
                }
            }
        
        return count;
    }   
}