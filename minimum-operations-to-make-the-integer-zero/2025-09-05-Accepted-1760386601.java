/*
 * Submission: 1760386601
 * Problem: Minimum Operations to Make the Integer Zero (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 11:20:15 UTC
 * Runtime: 1 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int makeTheIntegerZero(int n, int m) {
        int c = 40, ans = 0;
        long num1 = n, num2 = m;
        while (c>0) {
            ans++;
            num1 -= num2;
            int bitC = Long.bitCount(num1);
            if (ans >= bitC && ans <= num1) return ans;
            c--;
        }
        return -1;
    }
}