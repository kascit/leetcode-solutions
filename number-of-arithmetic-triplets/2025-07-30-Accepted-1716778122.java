/*
 * Submission: 1716778122
 * Problem: Number of Arithmetic Triplets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 07:25:04 UTC
 * Runtime: 2 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
        int len = arr.length, count = 0;
        for (int i = 0; i < len - 2; i++)
            for (int j = i+1; j < len - 1; j++){
                if (arr[j] - arr[i] == diff) {
                    for (int k = j+1; k < len; k++){
                        if (arr[k] - arr[j] == diff ) {
                            count++;
                        }
                    }
                }
            }
        
        return count;
    }
}