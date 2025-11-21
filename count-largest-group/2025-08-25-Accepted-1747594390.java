/*
 * Submission: 1747594390
 * Problem: Count Largest Group (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:13:35 UTC
 * Runtime: 3 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int countLargestGroup(int n) {
        int[] sums = new int[37];
        for (int i = 1; i <= n; i++) sums[digsum(i)]++;

        int maxi = 0, count = 0;
        for (int i : sums) {
            if (i > maxi) {
                maxi = i;
                count = 1;
            } else if (i == maxi) {
                count++;
            }
        }
        return count;
    }

    private int digsum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}