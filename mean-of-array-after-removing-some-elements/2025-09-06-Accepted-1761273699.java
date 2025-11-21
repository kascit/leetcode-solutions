/*
 * Submission: 1761273699
 * Problem: Mean of Array After Removing Some Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 08:41:53 UTC
 * Runtime: 3 ms
 * Memory: 44.8 MB
 */

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int skip = arr.length / 20;
        double mean = 0;
        for (int i = skip; i < arr.length - skip; i++) {
            mean += arr[i];
        }
        mean /= (arr.length - 2 * skip);
        return mean;
    }
}