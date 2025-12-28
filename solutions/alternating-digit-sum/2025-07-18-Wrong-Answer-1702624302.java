/*
 * Submission: 1702624302
 * Problem: Alternating Digit Sum (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 16:26:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int alternateDigitSum(int n) {
        int m = n, check = 1, ans = 0;
        boolean flag = true;
        while (m/check > 10){
            check *= 10;
        }
        while(n > 0){
            //System.out.println(n + " " +check + " " + ans);
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