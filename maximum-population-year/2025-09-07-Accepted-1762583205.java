/*
 * Submission: 1762583205
 * Problem: Maximum Population Year (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 11:23:12 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public int maximumPopulation(int[][] logs) {
        int firsty = 2050, lasty = 0;
        for(int[] l : logs) {
            if (l[0] < firsty) firsty = l[0];
            if (l[1] > lasty) lasty = l[1];
        }
        // System.out.println(firsty+"   "+lasty);
        int diff = lasty-firsty+1;
        int[]dundun = new int[diff];
        for(int[] l : logs) {
            dundun[l[0]-firsty]++;
            dundun[l[1]-firsty]--;
        }
        int max = -1;
        for (int i = 0; i < diff; i++) {
            if (i > 0) dundun[i] += dundun[i-1];
            if (max == -1 || dundun[i] > dundun[max]) {
                max= i;
            }
        }

        // System.out.println(Arrays.toString(dundun));
        return max+firsty;
    }
}