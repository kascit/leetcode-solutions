/*
 * Submission: 1746648879
 * Problem: Count Operations to Obtain Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:28:24 UTC
 * Runtime: 1 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int countOperations(int num1, int num2) {
        int c = 0;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
            c++;
        } return c;
    }
}