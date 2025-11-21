/*
 * Submission: 1746738799
 * Problem: Check If N and Its Double Exist (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:58:56 UTC
 * Runtime: 2 ms
 * Memory: 43.5 MB
 */

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] * 2)) {
                return true;
            }
            if (arr[i] % 2 == 0 && set.contains(arr[i] / 2)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}