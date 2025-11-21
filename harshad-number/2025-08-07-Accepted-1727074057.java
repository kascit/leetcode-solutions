/*
 * Submission: 1727074057
 * Problem: Harshad Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 16:30:43 UTC
 * Runtime: 0 ms
 * Memory: 40 MB
 */

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int T = x, sum = 0;
        while(T>0){
            sum += T%10;
            T/=10;
        }
        return (x%sum == 0) ? sum : -1;
    }
}