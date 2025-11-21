/*
 * Submission: 1834120970
 * Problem: Number of Beautiful Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:29:18 UTC
 * Runtime: 19 ms
 * Memory: 46.5 MB
 */

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0, len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int first = nums[i];
                while (first > 9) first /= 10;
                int last = nums[j]%10;
                if (gcd(first,last) == 1) cnt++;
            }
        } return cnt;
    }
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}