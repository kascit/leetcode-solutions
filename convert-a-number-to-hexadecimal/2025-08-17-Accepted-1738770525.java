/*
 * Submission: 1738770525
 * Problem: Convert a Number to Hexadecimal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:02:33 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int val = num & 15; // last 4 bits
            sb.insert(0,hexChars[val]);
            num >>>= 4; // unsigned shift
        }
        return sb.toString();
    }
}