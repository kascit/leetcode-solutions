/*
 * Submission: 1705772098
 * Problem: Final Value of Variable After Performing Operations (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 10:00:28 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int cnt = 0;
        for (int i = 0; i < operations.length; i++){
            if (operations[i].indexOf('+') != -1) cnt++;
            else cnt--;
        }
        return cnt;
    }
}