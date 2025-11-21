/*
 * Submission: 1761519490
 * Problem: Find Nearest Point That Has the Same X or Y Coordinate (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 13:45:45 UTC
 * Runtime: 2 ms
 * Memory: 49.7 MB
 */

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = 10000, idx = -1, it = 0;
        for (int[] p : points) {
            if (p[0] == x) {
                int dy = p[1]-y;
                if (dy < 0) dy *= -1;
                if (ans > dy){
                    ans = dy;
                    idx = it;
                }
            }
            else if (p[1] == y) {
                int dx = p[0]-x;
                if (dx < 0) dx *= -1;
                if (ans > dx){
                    ans = dx;
                    idx = it;
                }
            }
            it++;
        } return idx;
    }
}