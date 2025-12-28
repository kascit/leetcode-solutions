/*
 * Submission: 1721814631
 * Problem: Count the Digits That Divide a Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 11:35:19 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int countDigits(int num) {
        int TEMP = num, count = 0;
        while (TEMP > 0){
            int cur = TEMP%10;
            if (cur == 1 || (cur == 2 && (num&1) == 0)) count++;
            else if (num%cur == 0) count++;
            TEMP /= 10;
        } return count;
    }
}