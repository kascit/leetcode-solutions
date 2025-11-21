/*
 * Submission: 1763982297
 * Problem: Max Pair Sum in an Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-08 16:10:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxSum(int[] nums) {
        int len = nums.length;
        int[][] idk = new int[10][2];
        for (int n : nums) {
            int dig = maxD(n);
            if(n > idk[dig][0]) {
                idk[dig][1] = idk[dig][0];
                idk[dig][0] = n;
            } else if (n > idk[dig][1]) {
                idk[dig][1] = n;
            }
        }

        for (int i = 9; i >= 0; i--) {
            if (idk[i][0] > 0 && idk[i][1] > 0) {
                return idk[i][0] + idk[i][1];
            }
        } return -1;
    }

    private int maxD(int n) {
        int max = 0;
        while (n > 0) {
            int cur = n % 10;
            if (cur > max) max = cur;
            n /= 10;
        } return max;
    }
}