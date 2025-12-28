/*
 * Submission: 1744555168
 * Problem: Maximum Units on a Truck (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 16:37:52 UTC
 * Runtime: 24 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,
            (a,b) -> Integer.compare(b[1],a[1])
        );
        int units = 0;
        int idx = 0;
        while (truckSize>0 && idx < boxTypes.length) {
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