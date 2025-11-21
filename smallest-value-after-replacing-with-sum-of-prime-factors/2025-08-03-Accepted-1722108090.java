/*
 * Submission: 1722108090
 * Problem: Smallest Value After Replacing With Sum of Prime Factors (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 16:35:11 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int smallestValue(int n) {
        if (isPrime(n) || n == 4) return n;
        int ans = 0;
        while ( (n&1) == 0 ){
            n/=2;
            ans += 2;
        }
        int i = 3;
        while (n > 1) {
            while (n % i == 0) {ans += i; n /= i;}
            i+=2;
        }
        // System.out.println(ans);
        return smallestValue(ans);
    }
    boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2) return true;
    if ((n & 1) == 0) return false;
    
    int sqrt = (int)Math.sqrt(n);
    for (int i = 3; i <= sqrt; i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}

}