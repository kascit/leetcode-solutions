/*
Submission: 1844372456
Status: Accepted
Timestamp: 2025-12-01 17:50:29 UTC
Runtime: 12 ms
Memory: 47.9 MB
*/

class Solution {

    boolean poss(int[] piles, int h, int mid) {
        int ans = 0;
        for (int pile : piles) {
            ans += pile / mid;
            if (pile % mid != 0) {
                ans++;
            }
        }
        return ans <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        // int high = Arrays.stream(piles).max().getAsInt();
        int high = -1;
        for (int p : piles) high = p > high ? p : high;

        while (low < high) {
            int mid = (low + high) >> 1;
            if (poss(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}