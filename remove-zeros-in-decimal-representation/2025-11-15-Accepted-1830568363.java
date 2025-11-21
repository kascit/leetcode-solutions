/*
 * Submission: 1830568363
 * Problem: Remove Zeros in Decimal Representation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:41:19 UTC
 * Runtime: 2 ms
 * Memory: 42.6 MB
 */

class Solution {
    public long removeZeros(long n) {
        return Long.parseLong(Long.toString(n).replace("0", ""));
    }
}
