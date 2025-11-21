/*
 * Submission: 1760382778
 * Problem: Smallest Divisible Digit Product I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 11:15:30 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitMul(n)%t==0){
                return n;
            }else{
                n++;
            }
        }
    }
    
    public int digitMul(int k){
        int m = 1;
        while(k>0){
            int d = k%10;
            if (d == 0) return 0;
            m*=d;
            k/=10;
        }
        return m;
    }
}