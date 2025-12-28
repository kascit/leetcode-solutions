/*
Submission: 1836431806
Status: Accepted
Timestamp: 2025-11-22 04:05:54 UTC
Runtime: 0 ms
Memory: 43.6 MB
*/

class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int num : nums){
            if (num%3 != 0) ans++;
        }
        return ans;
    }
}