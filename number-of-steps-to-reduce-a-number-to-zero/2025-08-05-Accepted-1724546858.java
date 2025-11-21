/*
 * Submission: 1724546858
 * Problem: Number of Steps to Reduce a Number to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:27:28 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0){
            if ((num&1) == 0){
                num /= 2;
            } else num -= 1;
            steps++;
        } return steps;
    }
}