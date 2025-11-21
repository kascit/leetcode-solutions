/*
 * Submission: 1738352755
 * Problem: Make Array Zero by Subtracting Equal Amounts (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 09:45:02 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int less = 0, ans = 0;
        for (int n : nums){
            if (n == less) continue;
            less += (n-less); ans++;
        } return ans;
    }
}