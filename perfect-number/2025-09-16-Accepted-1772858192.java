/*
 * Submission: 1772858192
 * Problem: Perfect Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 15:02:37 UTC
 * Runtime: 2091 ms
 * Memory: 41 MB
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0) {
                sum += i;
            }
        } return sum == num;
    }
}