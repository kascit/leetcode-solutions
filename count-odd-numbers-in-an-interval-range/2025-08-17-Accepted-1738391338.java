/*
 * Submission: 1738391338
 * Problem: Count Odd Numbers in an Interval Range (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:28:49 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int countOdds(int low, int high) {
        int elem = high - low + 1;
        // System.out.println(elem);
        if( (elem&1) == 0) return elem/2;
        return ((low&1) == 0) ? elem/2 : elem/2 + 1;

    }
}