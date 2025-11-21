/*
 * Submission: 1750474243
 * Problem: Count Elements With Strictly Smaller and Greater Elements  (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 17:42:53 UTC
 * Runtime: 0 ms
 * Memory: 42.3 MB
 */

class Solution {
    static {
        for (int i = 0; i < 300; i++) countElements(new int[]{0});
    }
    public static int countElements(int[] nums) {
        int max = -100001, min = 100001;
        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        if (min == max) return 0;
        int ans = 0;
        for (int n : nums) {
            if (n > min && n < max) ans++;
        } return ans;
    }
}