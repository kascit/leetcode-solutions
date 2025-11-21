/*
 * Submission: 1762913344
 * Problem: Prime Arrangements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 17:11:04 UTC
 * Runtime: 0 ms
 * Memory: 40.3 MB
 */

class Solution {
    static final int MOD = (int) 1e9 + 7;
    static final int MAX = 100;
    static final long[] facts = new long[MAX + 1];
    static final int[] primeCount = new int[MAX + 1];

    static {
        facts[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            facts[i] = (facts[i - 1] * i) % MOD;
        }

        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 1; i <= MAX; i++) {
            primeCount[i] = primeCount[i - 1] + (isPrime[i] ? 1 : 0);
        }
    }

    public int numPrimeArrangements(int n) {
        int p = primeCount[n];
        int np = n - p;
        long ans = (facts[p] * facts[np]) % MOD;
        return (int) ans;
    }
}
