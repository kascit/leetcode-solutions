/*
 * Submission: 1754956149
 * Problem: Excel Sheet Column Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:17:14 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int titleToNumber(String columnTitle) {
        int p = columnTitle.length() - 1;
        int t = 1, ans = 0;
        while (p>=0){
            ans += t* (columnTitle.charAt(p)-64);
            t*=26;
            p--;
        } return ans;
    }
}