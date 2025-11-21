/*
 * Submission: 1603489634
 * Problem: Minimum Number of Days to Make m Bouquets (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 08:55:06 UTC
 * Runtime: 2428 ms
 * Memory: 57.8 MB
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

    boolean isPossible(int[] arr, int days, int m, int k){
        int adj = 0, ans = 0;
        for (int num : arr){
            if (num <= days){
                adj++;
            } else {
                ans += (int) adj/k;
                adj = 0;
                System.out.println("ans: " + ans + "adj: " + adj);
            }
        }
        ans += (int) adj/k;
        System.out.println(ans);
        return ans >= m;
    }
}