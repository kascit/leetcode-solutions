/*
 * Submission: 1602529032
 * Problem: Can Place Flowers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:28:28 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}