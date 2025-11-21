/*
 * Submission: 1753775554
 * Problem: Minimum Amount of Time to Fill Cups (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 16:15:18 UTC
 * Runtime: 3 ms
 * Memory: 41.7 MB
 */

class Solution {
    public int fillCups(int[] amount) {
        return Math.max((Arrays.stream(amount).sum()+1)/2,Arrays.stream(amount).max().getAsInt());
    }
}