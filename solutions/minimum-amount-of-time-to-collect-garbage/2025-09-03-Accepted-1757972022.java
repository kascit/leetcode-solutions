/*
 * Submission: 1757972022
 * Problem: Minimum Amount of Time to Collect Garbage (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 08:05:07 UTC
 * Runtime: 5 ms
 * Memory: 60.3 MB
 */

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int lastG = -1, lastM = -1, lastP = -1, len = garbage.length, ans = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (lastG == -1 && garbage[i].indexOf('G') != -1) {
                lastG = i;
            }
            if (lastM == -1 && garbage[i].indexOf('M') != -1) {
                lastM = i;
            }
            if (lastP == -1 && garbage[i].indexOf('P') != -1) {
                lastP = i;
            }
            if (lastP != -1 && lastM != -1 && lastG != -1) break;
        }
        for (int i = 0; i < len; i++) {
            ans += garbage[i].length();
            if (i > 0) {
                if (i <= lastP) ans += travel[i-1];
                if (i <= lastG) ans += travel[i-1];
                if (i <= lastM) ans += travel[i-1];
            }
        } return ans;
    }
}
/*
1
2 2 1
4 4 1 1
3 1 1

1 2 4 1 3 1 1
2 1 4 1

*/