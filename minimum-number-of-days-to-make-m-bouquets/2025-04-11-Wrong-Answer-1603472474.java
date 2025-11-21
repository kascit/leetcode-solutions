/*
 * Submission: 1603472474
 * Problem: Minimum Number of Days to Make m Bouquets (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 08:28:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length) return -1;
        int low = 0, high = bloomDay.length - 1;
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
                System.out.println(ans);
            }
        }
        ans += (int) adj/k;
        System.out.println(ans);
        return ans >= m;
    }
}