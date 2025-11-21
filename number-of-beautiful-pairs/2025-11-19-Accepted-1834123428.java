/*
 * Submission: 1834123428
 * Problem: Number of Beautiful Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:33:22 UTC
 * Runtime: 11 ms
 * Memory: 46.6 MB
 */

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0, len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int first = nums[i];
            while (first > 9) first /= 10;
            if (first == 1) {
                cnt += len - i - 1;
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                int last = nums[j]%10;
                if (last == 1 || gcd(first,last) == 1) cnt++;
            }
        } return cnt;
    }
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}