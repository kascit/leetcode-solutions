/*
 * Submission: 1762609643
 * Problem: Check if Any Element Has Prime Frequency (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 11:54:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];
        for (int n : nums) {
            freq[n]++;
        }
        for (int f : freq) {
            if (f == 0 || f == 1) continue;
            if (isPrime(f)) return true;
        } return false;
    }

    private boolean isPrime(int n) {
        if (n == 2) return true;
        if (n%2 == 0) return false;
        for (int i = 3; i*i < n; i++) {
            if (n%i == 0) return false;
        } return true;
    }
}