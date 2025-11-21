/*
 * Submission: 1607375005
 * Problem: Assign Cookies (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-15 08:53:11 UTC
 * Runtime: 10 ms
 * Memory: 48.4 MB
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);Arrays.sort(g);
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