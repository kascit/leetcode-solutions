/*
 * Submission: 1746255499
 * Problem: GCD of Odd and Even Sums (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 06:19:19 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd( n*n, n*(n+1) );
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b,a%b);
    }

    // n/2(1+(1+n+2))
}


// 6   16
//     12
//     04  06
//         04
//         02  04
//             04
//             00