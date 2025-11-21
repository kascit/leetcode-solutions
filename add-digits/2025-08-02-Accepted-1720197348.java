/*
 * Submission: 1720197348
 * Problem: Add Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-02 05:18:42 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num > 9){
            sum = 0;
            while (num > 0){
                sum += num%10;
                num /= 10;
            } 
            num = sum;
        }
        return num;
    }
}