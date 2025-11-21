/*
 * Submission: 1758485725
 * Problem: Divide Two Integers (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:18:51 UTC
 * Runtime: 1 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(divisor==1){
            return dividend;
        }
        int i = 1;
        if (dividend < 0) {
            dividend *= -1;
            i *= -1;
        }
        if (divisor < 0) {
            divisor *= -1;
            i *= -1;
        }
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int ans=0;
        while(a>=b){
            int count=0;
            while(a>=(b<<(count+1))){
                count++;
            }
            ans+=(1<<count);
            a=a-(b*(1<<count));
        }
        return ans*i;
    }
}