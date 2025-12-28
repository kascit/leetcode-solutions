/*
 * Submission: 1738371392
 * Problem: Prime Number of Set Bits in Binary Representation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 10:06:24 UTC
 * Runtime: 6 ms
 * Memory: 40.3 MB
 */

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans =  0;
        for(int i = left; i <= right; i++){
            int bits = 0;
            int T = i;
            while(T > 0){
                bits ++;
                T &= (T-1);
            }
            if (isPrime(bits)) ans++;
        }
         return ans;
    }

    private boolean isPrime(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        if ((n&1) == 0) return false;
        int sq = (int) Math.sqrt(n);
        for(int i = 3; i <= sq; i+=2){
            if (n%i == 0) return false;
        }
        return true;
    }
}