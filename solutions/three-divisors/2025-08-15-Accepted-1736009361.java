/*
 * Submission: 1736009361
 * Problem: Three Divisors (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 11:07:03 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public boolean isThree(int n) {
        int c = 2;
        for(int i = 2; i < n; i++){
            if(n%i == 0) c++;
            if (c > 3) return false;
        } return c == 3;
    }
}