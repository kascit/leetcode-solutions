/*
 * Submission: 1772891572
 * Problem: Maximum Height of a Triangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 15:33:33 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        if (red < blue) {
            int t = red;
            red = blue;
            blue = t;
        }
        int odd = 1, even = 2, h = 0;
        int r = red, b = blue;
        while (red >= 0 && blue >= 0) {
            blue -= odd;
            if (blue < 0) break;
            h++;
            red -= even;
            if (red < 0) break;
            h++;
            odd += 2;
            even += 2;
        }
        int h2 = h;
        red = b;
        blue = r;
        odd = 1; even = 2; h = 0;
        while (red >= 0 && blue >= 0) {
            blue -= odd;
            if (blue < 0) break;
            h++;
            red -= even;
            if (red < 0) break;
            h++;
            odd += 2;
            even += 2;
        }
        return Math.max(h,h2);
    }
}