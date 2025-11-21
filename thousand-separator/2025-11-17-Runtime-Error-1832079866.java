/*
 * Submission: 1832079866
 * Problem: Thousand Separator (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-11-17 07:40:45 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String thousandSeparator(int n) {
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