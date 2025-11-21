/*
 * Submission: 1748849482
 * Problem: Find XOR Sum of All Pairs Bitwise AND (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 10:07:31 UTC
 * Runtime: 2 ms
 * Memory: 58.5 MB
 */

class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int a = 0, b = 0;
        for (int i : arr1){
            a^=i;
        }
        for (int i : arr2) {
            b^=i;
        }
        return a&b;
    }
}