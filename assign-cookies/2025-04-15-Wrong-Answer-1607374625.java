/*
 * Submission: 1607374625
 * Problem: Assign Cookies (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-15 08:52:36 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int j = 0, c = 0;
        for(int i = 0; i < s.length; i++){
            if( j < g.length && g[j] <= s[i]){
                c++;
                j++;
            }
        }
        return c;
    }
}