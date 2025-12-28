/*
 * Submission: 1762631887
 * Problem: Find the K-Beauty of a Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 12:21:09 UTC
 * Runtime: 0 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int n = str.length();
        int ans = 0;

        // precompute 10^(k-1) for dropping leftmost digit
        int base = 1;
        for (int i = 1; i < k; i++) base *= 10;

        // first window
        int div = Integer.parseInt(str.substring(0, k));
        if (div != 0 && num % div == 0) ans++;

        // slide the window
        for (int i = k; i < n; i++) {
            div = div % base;                    // drop leftmost digit
            div = div * 10 + (str.charAt(i) - '0'); // add new digit
            if (div != 0 && num % div == 0) ans++;
        }
        return ans;
    }
}
