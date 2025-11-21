/*
 * Submission: 1762814961
 * Problem: Construct the Rectangle (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 15:38:52 UTC
 * Runtime: 1 ms
 * Memory: 41.7 MB
 */

class Solution {
    public int[] constructRectangle(int area) {
        int c = (int) Math.sqrt(area);
        int k = 1 + (area&1), a = 0, b = 0, min = area;
        for (int i = 1; i <= c; i+=k) {
            if (area%i == 0) {
                int l = area/i;
                int w = i;
                int diff = Math.abs(l-w);
                if (diff < min) {
                    a = l;
                    b = w;
                }
            }
        }
        if (b > a) {
            int t = a;
            a = b;
            b = a;
        } return new int[] {a,b};
    }
}