/*
 * Submission: 1761403908
 * Problem: Calculate Amount Paid in Taxes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:21:45 UTC
 * Runtime: 0 ms
 * Memory: 44.5 MB
 */

class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        int i = 0, done = 0;
        while (income > 0) {
            double cur = Math.min(income,brackets[i][0]-done);
            done += cur;
            income -= cur;
            // System.out.println(cur);
            // System.out.println(brackets[i][1]);
            ans += cur*brackets[i][1]/100d;
            i++;
        } return ans;
    }
}