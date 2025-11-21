/*
 * Submission: 1745557034
 * Problem: Base 7 (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-23 15:47:50 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String convertToBase7(int num) {
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