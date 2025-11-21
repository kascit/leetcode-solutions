/*
 * Submission: 1705720657
 * Problem: Minimum Cost to Move Chips to The Same Position (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 09:10:15 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int minCostToMoveChips(int[] position) {
        int count = 0;
        for(int i = 0; i < position.length; i++){
            count = (position[i]%2 == 0) ? count + 1: count;
        }

        return (position.length - count > count) ? count : position.length - count;
    }
}