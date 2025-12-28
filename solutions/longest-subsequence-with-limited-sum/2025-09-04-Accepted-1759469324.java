/*
 * Submission: 1759469324
 * Problem: Longest Subsequence With Limited Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 14:47:46 UTC
 * Runtime: 6 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] pref = new int[len+1];
        for(int i = 1; i < len + 1; i++) {
            pref[i] = pref[i-1] + nums[i-1];
        }
        // System.out.println(Arrays.toString(pref));
        for(int i = 0; i < queries.length; i++) {
            int j = 0;
            while (j < len + 1 && pref[j] <= queries[i]) {
                j++;
            }
            queries[i] = --j;
        } return queries;
    }
}