/*
 * Submission: 1771312863
 * Problem: Watering Plants (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 07:27:01 UTC
 * Runtime: 0 ms
 * Memory: 43 MB
 */

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cur = capacity, len = plants.length, last = -1, ans = 0;
        for (int i = 0; i < len; i++) {
            int tod = plants[i];
            if (tod <= cur) {
                cur -= tod;
                ans += i - last;
            } else {
                ans += 2*i + 1;
                cur = capacity - tod;
            }
            last = i;
            // System.out.println("i: " + i + "  ans: " + ans);
        } return ans;
    }
}