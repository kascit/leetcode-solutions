/*
 * Submission: 1744554392
 * Problem: Maximum Units on a Truck (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-22 16:37:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,
            (a,b) -> Integer.compare(b[1],a[1])
        );
        int units = 0;
        int idx = 0;
        while (truckSize>0) {
            if (boxTypes[idx][0] > 0){
                units+=boxTypes[idx][1];
                boxTypes[idx][0]--;
                truckSize--;
            } else {
                idx++;
            }
        } return units;
    }
}