/*
 * Submission: 1710769862
 * Problem: Maximum Number of Coins You Can Get (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 09:13:16 UTC
 * Runtime: 27 ms
 * Memory: 56.5 MB
 */

class Solution {
    public int maxCoins(int[] piles) {
        int sum = 0;
        Arrays.sort(piles);
        int len = piles.length;
        for (int i = len/3; i < len; i+=2){
            sum+=piles[i];
        }
        return sum;
    }
}