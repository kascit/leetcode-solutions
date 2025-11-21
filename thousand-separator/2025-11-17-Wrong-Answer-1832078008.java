/*
 * Submission: 1832078008
 * Problem: Thousand Separator (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-17 07:38:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (n > 0) {
            int cur = n%10;
            n/=10;
            if (i == 0) sb.append('.');
            // sb.reverse();
            sb.append(cur);
            i++;
            i%=4;
        } return sb.reverse().toString();
    }
}