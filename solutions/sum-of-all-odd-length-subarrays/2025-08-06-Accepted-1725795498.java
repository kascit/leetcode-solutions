/*
 * Submission: 1725795498
 * Problem: Sum of All Odd Length Subarrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 15:07:51 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, answer = 0;

        for (int i = 0; i < n; ++i) {
            int total = (i + 1) * (n - i);       
            int oddCount = (total + 1) / 2;      
            answer += arr[i] * oddCount;
        }

        return answer;
    }
}