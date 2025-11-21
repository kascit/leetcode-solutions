/*
 * Submission: 1831312282
 * Problem: Earliest Finish Time for Land and Water Rides I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:31:50 UTC
 * Runtime: 3 ms
 * Memory: 46.8 MB
 */

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;
        
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int finish1 = waterStart + waterDuration[j];

                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }
        return ans;
    }
}
