/*
 * Submission: 1698905558
 * Problem: Convert the Temperature (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 14:32:51 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[] { celsius + 273.15, celsius * 1.80 + 32.00 };
    }
}