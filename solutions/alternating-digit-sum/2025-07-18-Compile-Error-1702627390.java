/*
 * Submission: 1702627390
 * Problem: Alternating Digit Sum (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-07-18 16:28:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int alternateDigitSum(int n) {
        if (n & (n-1) == 0) return 1;
        int m = n, check = 1, ans = 0;
        boolean flag = true;
        while (m/check > 10){
            check *= 10;
        }
        while(n > 0){
            System.out.println(n + " " +check + " " + ans);
            if (flag){
                ans += n/check;
            }
            else {
                ans -= n/check;
            }
            flag = !flag;
            n %= check;
            check /= 10;
        }
        return ans;
    }
}