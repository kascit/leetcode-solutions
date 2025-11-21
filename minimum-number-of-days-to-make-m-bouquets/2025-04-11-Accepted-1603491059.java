/*
 * Submission: 1603491059
 * Problem: Minimum Number of Days to Make m Bouquets (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 08:57:04 UTC
 * Runtime: 15 ms
 * Memory: 56.1 MB
 */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m*k > bloomDay.length) return -1;
        
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low <= high ){
            int mid = (high + low) /2;
            if (isPossible(bloomDay,  m, k, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    private boolean isPossible(int[] bloomDay, int m, int k, int day) {
        int total = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            int count = 0;
            while (i < bloomDay.length && count < k && bloomDay[i] <= day) {
                count++;
                i++;
            }

            if (count == k) {
                total++;
                i--;
            }

            if (total >= m) {
                return true;
            }
        }

        return false;
    }
}