/*
 * Submission: 1834117928
 * Problem: Number of Beautiful Pairs (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 10:24:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0, len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (gcd(nums[i],nums[j]) == 1) cnt++;
            }
        } return cnt;
    }
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}