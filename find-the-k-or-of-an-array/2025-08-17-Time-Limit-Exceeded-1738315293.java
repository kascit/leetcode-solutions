/*
 * Submission: 1738315293
 * Problem: Find the K-or of an Array (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-08-17 09:00:33 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findKOr(int[] nums, int k) {
        int max = 0;
        for (int n : nums){
            max = (max > n) ? max : n;
        }
        int ans = 0;
        int cur = 1;
        while(cur <= max){
            int count = 0;
            for (int n : nums){
                if ( (n&(cur)) == cur) count++;
            }
            // System.out.println(cur+"   "+count);
            if (count >= k) ans += cur;
            cur <<= 1;
        } return ans;
    }
}