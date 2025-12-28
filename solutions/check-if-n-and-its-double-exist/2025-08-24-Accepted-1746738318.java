/*
 * Submission: 1746738318
 * Problem: Check If N and Its Double Exist (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:58:24 UTC
 * Runtime: 3 ms
 * Memory: 43.3 MB
 */

class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) return true;
            }
        } return false;
    }
}