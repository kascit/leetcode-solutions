/*
 * Submission: 1806536390
 * Problem: Final Value of Variable After Performing Operations (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-20 07:25:36 UTC
 * Runtime: 0 ms
 * Memory: 42.3 MB
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