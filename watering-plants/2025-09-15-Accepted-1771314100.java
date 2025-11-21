/*
 * Submission: 1771314100
 * Problem: Watering Plants (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 07:28:47 UTC
 * Runtime: 0 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cur = capacity, len = plants.length, ans = 0;
        for (int i = 0; i < len; i++) {
            int tod = plants[i];
            if (tod <= cur) {
                cur -= tod;
                ans++;
            } else {
                ans += 2*i + 1;
                cur = capacity - tod;
            }
            // last = i;
            // System.out.println("i: " + i + "  ans: " + ans);
        } return ans;
    }
}