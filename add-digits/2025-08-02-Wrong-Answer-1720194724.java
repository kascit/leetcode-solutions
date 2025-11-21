/*
 * Submission: 1720194724
 * Problem: Add Digits (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-02 05:15:39 UTC
 * Runtime: N/A
 * Memory: N/A
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
        return sum;
    }
}