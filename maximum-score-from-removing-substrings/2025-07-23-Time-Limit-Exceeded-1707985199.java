/*
 * Submission: 1707985199
 * Problem: Maximum Score From Removing Substrings (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-07-23 04:15:12 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        String great = (x>y) ? "ab" : "ba", mini = (great.equals("ab")) ? "ba" : "ab";
        int big = (x>y) ? x : y, small = x + y - big;
        int sum = 0, idx = 0;
        while ((idx = sb.indexOf(great)) != -1) {
            sb.delete(idx, idx + great.length());
            sum += big;
        }
        while ((idx = sb.indexOf(mini)) != -1) {
            sb.delete(idx, idx + mini.length());
            sum += small;
        }
        // while(!sb.isEmpty()){
        //     if (sb.charAt(0) == 'x') {
        //         sum += x;
        //     }
        //     else {
        //         sum += y;
        //     }
        //     sb.deleteCharAt(0);
        // }
        return sum;
        
    }
}