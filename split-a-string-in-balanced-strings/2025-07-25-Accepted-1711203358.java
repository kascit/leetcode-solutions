/*
 * Submission: 1711203358
 * Problem: Split a String in Balanced Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 16:10:21 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int balancedStringSplit(String s) {
        int r = 0, l = 0, cnt = 0;
        for(char ch : s.toCharArray()){
            if (ch == 'L') l++;
            else r++;
            if (l==r) {
                cnt++; l = 0; r= 0;
            }
        }return cnt;
    }
}