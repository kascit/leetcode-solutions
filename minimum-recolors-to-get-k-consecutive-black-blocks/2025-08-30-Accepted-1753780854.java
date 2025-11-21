/*
 * Submission: 1753780854
 * Problem: Minimum Recolors to Get K Consecutive Black Blocks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 16:20:10 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int b = 0;
        for (int i = 0; i < k; i++){
            if (blocks.charAt(i)=='B')b++;
        }
        // System.out.println(b);
        int m = b;
        for (int i = k; i < len; i++){
            if (blocks.charAt(i)=='B')b++;
            if (blocks.charAt(i-k)=='B')b--;
            m = Math.max(b,m);
        } return k - m;
    }
}