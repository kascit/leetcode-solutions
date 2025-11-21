/*
 * Submission: 1603504690
 * Problem: Capacity To Ship Packages Within D Days (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 09:15:53 UTC
 * Runtime: 10 ms
 * Memory: 47.6 MB
 */

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //Find the maximum and the summation:
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        low = Math.max(high/days, low);

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }
    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
}