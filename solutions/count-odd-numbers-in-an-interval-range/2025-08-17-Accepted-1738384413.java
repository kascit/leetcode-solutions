/*
 * Submission: 1738384413
 * Problem: Count Odd Numbers in an Interval Range (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:20:55 UTC
 * Runtime: 2022 ms
 * Memory: 41.2 MB
 */

class Solution {
    public int countOdds(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++){
            if ((i&1) == 1) c++;
        } return c;
    }
}