/*
 * Submission: 1722086459
 * Problem: Minimum Addition to Make Integer Beautiful (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-03 16:15:27 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if ( n <= target) return 0;
        long sum = sumOfDigits(n);
        long ans = 0;
        long place = 1;
        while (sum > target){
            if (n == 1) break;
            long cur = n%10;
            // System.out.println(n+"   "+cur + "   " + ans);
            if (cur == 0){
                n /= 10;
                place *= 10;
                continue;
            }
            ans += (10-cur)*place;
            sum = sum - cur + 1;
            n /= 10;
            n++;
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