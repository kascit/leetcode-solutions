/*
 * Submission: 1716731628
 * Problem: Count Good Triplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 06:40:42 UTC
 * Runtime: 10 ms
 * Memory: 42 MB
 */

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len = arr.length, count = 0;
        for (int i = 0; i < len; i++)
            for (int j = i+1; j < len; j++){
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