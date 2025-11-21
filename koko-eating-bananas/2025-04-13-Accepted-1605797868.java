/*
 * Submission: 1605797868
 * Problem: Koko Eating Bananas (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 16:49:54 UTC
 * Runtime: 14 ms
 * Memory: 44.6 MB
 */

class Solution {

    private int check(int[] piles, int h, int mid) {
        int ans = 0;
        for (int pile : piles) {
            ans += pile / mid;
            if (pile % mid != 0) {
                ans++;
            }
        }
        return ans <= h ? 1 : 0;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low < high) {
            int mid = (low + high) >> 1;
            if (check(piles, h, mid) == 1) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}