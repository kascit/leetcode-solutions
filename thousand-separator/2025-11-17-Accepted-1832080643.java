/*
 * Submission: 1832080643
 * Problem: Thousand Separator (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:41:52 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public String thousandSeparator(int n) {
        if (n < 1000) return String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n > 0) {
            int cur = n%10;
            n/=10;
            if (i == 0) sb.append('.');
            // sb.reverse();
            sb.append(cur);
            i++;
            i%=3;
        } sb.reverse().setLength(sb.length()-1);
        return sb.toString();
    }
}