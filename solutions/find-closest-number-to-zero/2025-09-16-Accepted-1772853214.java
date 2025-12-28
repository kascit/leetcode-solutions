/*
 * Submission: 1772853214
 * Problem: Find Closest Number to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 14:58:04 UTC
 * Runtime: 1 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int findClosestNumber(int[] nums) {
        int minPos = 100001, maxNeg = -100001;
        for (int n : nums) {
            if (n == 0) return 0;
            else if (n < 0) {
                maxNeg = Math.max(maxNeg,n);
            } else {
                minPos = Math.min(minPos,n);
            }
        }
        if (minPos == 100001) return maxNeg;
        if (maxNeg == -100001) return minPos;
        // maxNeg *= -1;
        return (-1*maxNeg < minPos) ? maxNeg : minPos;
    }
}