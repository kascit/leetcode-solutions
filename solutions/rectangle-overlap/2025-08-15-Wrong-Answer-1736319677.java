/*
 * Submission: 1736319677
 * Problem: Rectangle Overlap (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-15 16:03:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int xmin1 = Math.min(rec1[0],rec1[2]);
        int ymin1 = Math.min(rec1[1],rec1[3]);
        // int xmin2 = Math.min(rec2[0],rec2[2]);
        // int ymin2 = Math.min(rec2[1],rec2[3]);
        int xmax1 = Math.max(rec1[0],rec1[2]);
        int ymax1 = Math.max(rec1[1],rec1[3]);
        // int xmax2 = Math.max(rec2[0],rec2[2]);
        // int ymax2 = Math.max(rec2[1],rec2[3]);
        if ((rec2[0] > xmin1 && rec2[0] < xmax1) || (rec2[2] > xmin1 && rec2[2] < xmax1)) {
            if (ymin1 <= rec2[1] || ymin1 <= rec2[3])
                if (ymax1 >= rec2[1] || ymax1 >= rec2[3])
                    return true;
        }
        if ((rec2[0] > ymin1 && rec2[0] < ymax1) || (rec2[2] > ymin1 && rec2[2] < ymax1)) {
            if (xmin1 <= rec2[1] || xmin1 <= rec2[3])
                if (xmax1 >= rec2[1] || xmax1 >= rec2[3])
                    return true;
        }
        return false;
    }
}