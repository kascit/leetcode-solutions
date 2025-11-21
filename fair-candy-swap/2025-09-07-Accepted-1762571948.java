/*
 * Submission: 1762571948
 * Problem: Fair Candy Swap (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 11:09:23 UTC
 * Runtime: 204 ms
 * Memory: 46.2 MB
 */

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        for (int al : aliceSizes) {
            a+=al;
        }
        for (int al : bobSizes) {
            b+=al;
        }
        int half = (a+b)/2 - a;
        for (int al : aliceSizes) {
            for (int bl : bobSizes) {
                if (bl - al == half) return new int[] {al,bl};
            }
        }
        return null;
    }
}