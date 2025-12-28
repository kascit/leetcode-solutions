/*
 * Submission: 1758385388
 * Problem: Can Make Arithmetic Progression From Sequence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 15:53:18 UTC
 * Runtime: 2 ms
 * Memory: 42.3 MB
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