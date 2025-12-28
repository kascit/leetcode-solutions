/*
 * Submission: 1698879434
 * Problem: Divisible and Non-divisible Sums Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 14:10:15 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i%m == 0){
                sum -= i;
            }
            else sum += i;
        }
        return sum;
    }
}