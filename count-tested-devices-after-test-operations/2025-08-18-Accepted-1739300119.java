/*
 * Submission: 1739300119
 * Problem: Count Tested Devices After Test Operations (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 06:36:21 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int countTestedDevices(int[] b) {
        int cur = 0, ans = 0;
        for(int i : b){
            if (i > cur) {
                ans++;
                cur++;
            }

        } return ans;
    }
}