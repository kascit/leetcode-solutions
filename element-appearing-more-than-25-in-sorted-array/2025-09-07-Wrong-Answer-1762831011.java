/*
 * Submission: 1762831011
 * Problem: Element Appearing More Than 25% In Sorted Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 15:55:16 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int c = 1;
        if (len >= 4) {
            c += len/4;
        }
        int rc = 1;
        for (int i = 0; i < len - 1; i++) {
            if (rc == c) return arr[i];
            if (arr[i] == arr[i+1]) {
                rc++;
            } else rc = 1; 
        } return -1;
    }
}