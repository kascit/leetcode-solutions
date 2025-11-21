/*
 * Submission: 1762600890
 * Problem: Path Crossing (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-07 11:44:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPathCrossing(String path) {
        int len = path.length();
        int v = (len+1)/2, h = (len+1)/2;
        boolean[][] check = new boolean[len*2][len*2];
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