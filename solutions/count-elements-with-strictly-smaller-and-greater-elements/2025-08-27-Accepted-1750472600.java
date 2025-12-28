/*
 * Submission: 1750472600
 * Problem: Count Elements With Strictly Smaller and Greater Elements  (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 17:41:37 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int countElements(int[] nums) {
        int max = -100001, min = 100001;
        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        int ans = 0;
        for (int n : nums) {
            if (n > min && n < max) ans++;
        } return ans;
    }
}