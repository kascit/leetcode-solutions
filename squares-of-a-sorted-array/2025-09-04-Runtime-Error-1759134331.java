/*
 * Submission: 1759134331
 * Problem: Squares of a Sorted Array (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-04 08:18:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int firstNeg = -1, firstPos = -1;
        for(int i = 0; i < len && nums[i] < 0; i++) {
            firstNeg = i;
        }
        firstPos = firstNeg + 1;
        for (int i = 0; i < len; i++) {
            int min = -1;
            if (firstNeg > -1 && nums[firstNeg]*-1 < nums[firstPos]) {
                min = nums[firstNeg];
                firstNeg--;
            } else {
                min = nums[firstPos];
                firstPos++;
            }
            ans[i] = min*min;
        } return ans;
    }
}