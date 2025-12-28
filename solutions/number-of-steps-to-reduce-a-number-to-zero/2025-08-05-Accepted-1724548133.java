/*
 * Submission: 1724548133
 * Problem: Number of Steps to Reduce a Number to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:28:27 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0){
            if ((num&1) == 0){
                num >>= 1;
            } else num ^= 1;
            steps++;
        } return steps;
    }
}