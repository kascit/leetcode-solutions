/*
 * Submission: 1603490691
 * Problem: Minimum Number of Days to Make m Bouquets (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 08:56:34 UTC
 * Runtime: N/A
 * Memory: N/A
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
            if (isPossible(bloomDay, mid, m, k))
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