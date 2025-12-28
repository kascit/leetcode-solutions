/*
 * Submission: 1722126414
 * Problem: Minimum Addition to Make Integer Beautiful (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 16:51:08 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long ans = 0;
        long place = 1;
        while (sumOfDigits(n) > target){
            long cur = (10*place - n % (10*place));
            n = n + cur;
            ans += cur;
            place *= 10;
        }
        return ans;
    }
    long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}