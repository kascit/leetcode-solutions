/*
 * Submission: 1836032955
 * Problem: Check if Number is a Sum of Powers of Three (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 13:58:22 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) return false;
            n /= 3;
        }
        return true;
    }
}
