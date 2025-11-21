/*
 * Submission: 1738861929
 * Problem: Find the Maximum Divisibility Score (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:20:53 UTC
 * Runtime: 176 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = (int) 1e9, maxC = 0;
        for (int d : divisors){
            int c = 0;
            for (int n : nums){
                if (n%d == 0) c++;
                // System.out.print(n);
            }
            // System.out.println("  " + d + " count:  " + maxC +":" + c);

            if (maxC <= c) {
                if (maxC == c) ans = (ans < d) ? ans : d;
                else ans = d;
                maxC = c;
            }

        } return ans;
    }
}