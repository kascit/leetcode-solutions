/*
Submission: 1842229072
Status: Wrong Answer
Timestamp: 2025-11-29 05:48:29 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curM = nums[0];
        int min = Integer.MAX_VALUE;
        int curm = nums[0];
        for (int n : nums) {
            curM = Math.max(curM+n,n);
            max = Math.max(max,curM);

            curm = Math.min(curm+n,n);
            min = Math.min(min,curm);
        } 
        // System.out.println(curM + " " + max +" min: " + curm + " " + min);
        return Math.max(-min,max);
    }
}