/*
 * Submission: 1762599514
 * Problem: Path Crossing (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-07 11:42:35 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPathCrossing(String path) {
        int v = 0, h = 0;
        int len = path.length();
        boolean[][] check = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            check[v][h] = true;
            char cur = path.charAt(i);
            if (cur == 'N') {
                v++;
            } else if ( cur == 'S') {
                v--;
            } else if (cur == 'E') {
                h++;
            } else h--;
            if (check[v][h]) return true;
        } return false;
    }
}