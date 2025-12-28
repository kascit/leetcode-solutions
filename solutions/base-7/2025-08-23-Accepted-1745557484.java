/*
 * Submission: 1745557484
 * Problem: Base 7 (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:48:15 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean neg = false;
        if (num < 0) {
            neg = true;
            num *= -1;
        }
        while (num > 0) {
            sb.insert(0, (char)('0'+num%7) );
            num /= 7;
        }
        if (neg) sb.insert(0,'-');
        return sb.toString();
    }
}