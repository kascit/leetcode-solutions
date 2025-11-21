/*
 * Submission: 1762910965
 * Problem: Prime Arrangements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 17:08:55 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    long[] facts;
    int modulo = (int) 1e9 + 7;

    public int numPrimeArrangements(int n) {
        facts = new long[101];
        Arrays.fill(facts, -1);
        facts[0] = 1;
        facts[1] = 1;

        int p = 0;
        if (n >= 2) p++;
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) p++;
        }

        long ans = (facto(p) * facto(n - p)) % modulo;
        return (int) ans;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private long facto(int n) {
        if (facts[n] != -1) return facts[n];
        long f = (n * facto(n - 1)) % modulo;
        facts[n] = f;
        return f;
    }
}
