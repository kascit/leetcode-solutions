/*
 * Submission: 1603470144
 * Problem: Minimum Number of Days to Make m Bouquets (Medium)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-11 08:25:03 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 0, int high = bloomDay.length - 1;
        while (low <= high ){
            int mid = (high + low) /2;
            if (isPossible(bloomDay, mid, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    boolean isPossible(int[] arr, int days, int m, int k){
        int adj = 0, int ans = 0;
        for (int num : arr){
            if (num <= days){
                adj++;
            } else {
                ans += adj/k;
                adj = 0;
            }
        }
        ans += adj/k;
        return ans >= m;
    }
}