/*
 * Submission: 1772859142
 * Problem: Perfect Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 15:03:30 UTC
 * Runtime: 2078 ms
 * Memory: 40.9 MB
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0) {
                sum += i;
            }
            if(sum > num) return false;
        } return sum == num;
    }
}