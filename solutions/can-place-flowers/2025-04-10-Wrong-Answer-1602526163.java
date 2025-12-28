/*
 * Submission: 1602526163
 * Problem: Can Place Flowers (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-10 09:24:18 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for ( int i = 1; i < flowerbed.length - 1; i++ ){
            if (flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) n--;
        }
        return n == 0;
    }
}