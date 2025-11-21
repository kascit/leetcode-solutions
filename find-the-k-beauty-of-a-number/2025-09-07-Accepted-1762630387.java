/*
 * Submission: 1762630387
 * Problem: Find the K-Beauty of a Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 12:19:19 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int n = str.length();
        int ans = 0;

        int div = Integer.parseInt(str.substring(0, k));
        if (div != 0 && num % div == 0) ans++;

        for (int i = k; i < n; i++) {
            div = div % (int)Math.pow(10, k-1);
            div = div * 10 + (str.charAt(i) - '0');
            if (div != 0 && num % div == 0) ans++;
        }
        return ans;
    }
}
