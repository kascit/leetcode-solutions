/*
 * Submission: 1738336567
 * Problem: Number of Lines To Write String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 09:26:00 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        char[] arr = s.toCharArray();
        int last = 0, tot = 0;
        for (char ch : arr){
            int cur = widths[ch-'a'];
            if (tot + cur > 100){
                tot = cur;
                lines++;
            }
            else tot += cur;
            last = tot;
        }
        return new int[]{lines,last};
    }
}