/*
 * Submission: 1761448382
 * Problem: Special Array With X Elements Greater Than or Equal X (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:18:49 UTC
 * Runtime: 2 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        // System.out.println(Arrays.toString(nums));
        int[] g = new int[nums[len-1]+1];
        for(int i = len - 1; i >= 0; i--) {
            g[nums[i]]++;
        }
        int c = 0;
        for (int i = nums[len-1]; i>= 0; i--) {
        // System.out.println(Arrays.toString(g));
            int t = g[i];
            g[i] += c;
            if (g[i] == i) return i;
            c += t;
        } return -1;
    }
}