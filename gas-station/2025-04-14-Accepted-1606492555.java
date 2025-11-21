/*
 * Submission: 1606492555
 * Problem: Gas Station (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 10:49:30 UTC
 * Runtime: 2 ms
 * Memory: 56.1 MB
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int totalGas = 0;
        int currentGas = 0;

        for (int i = 0; i < gas.length; i++) {
            int fuelGain = gas[i] - cost[i];
            totalGas += fuelGain;
            currentGas += fuelGain;

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return totalGas < 0 ? -1 : start;        
    }
}