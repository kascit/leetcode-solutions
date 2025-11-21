/*
 * Submission: 1724495004
 * Problem: Subtract the Product and Sum of Digits of an Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 14:44:20 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        while(n > 0){
            int cur = n%10;
            prod *= cur;
            sum += cur;
            n /= 10;
        } return prod - sum;
    }
}