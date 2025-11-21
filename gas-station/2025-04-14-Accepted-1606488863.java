/*
 * Submission: 1606488863
 * Problem: Gas Station (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 10:44:23 UTC
 * Runtime: 3 ms
 * Memory: 56.4 MB
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int n = gas.length;
        int start = 0, tg = 0, tc = 0;
        for(int i = 0; i<n; i++){
            tg += gas[i];
            tc += cost[i];
            sum += gas[i]-cost[i];
            if(sum<0){
                start = i+1;
                sum = 0;
            }
        }
        return (tg<tc) ? -1 : start;
    }
}