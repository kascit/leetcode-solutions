/*
 * Submission: 1828830937
 * Problem: Can Make Arithmetic Progression From Sequence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 15:17:47 UTC
 * Runtime: 5 ms
 * Memory: 44.1 MB
 */

class Solution {
    public boolean canMakeArithmeticProgression(int[] temp) {
        Arrays.sort(temp);
        int diff = temp[1] - temp[0];
        for (int i = 2; i < temp.length; i++) {
            if (temp[i] - temp[i-1] != diff) return false;
        } return true;
    }
}