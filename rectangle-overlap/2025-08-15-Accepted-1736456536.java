/*
 * Submission: 1736456536
 * Problem: Rectangle Overlap (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 17:56:11 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int xmin1 = rec1[0];
        int ymin1 = rec1[1];
        // int xmin2 = Math.min(rec2[0],rec2[2]);
        // int ymin2 = Math.min(rec2[1],rec2[3]);
        int xmax1 = rec1[2];
        int ymax1 = rec1[3];
        // int xmax2 = Math.max(rec2[0],rec2[2]);
        // int ymax2 = Math.max(rec2[1],rec2[3]);
        if ((rec2[0] > xmin1 && rec2[0] < xmax1) || (rec2[2] > xmin1 && rec2[2] < xmax1)) {
            if (ymin1 < rec2[1] || ymin1 < rec2[3])
                if (ymax1 > rec2[1] || ymax1 > rec2[3])
                    return true;
        }
        if ((rec2[1] > ymin1 && rec2[1] < ymax1) || (rec2[3] > ymin1 && rec2[3] < ymax1)) {
            if (xmin1 < rec2[0] || xmin1 < rec2[2])
                if (xmax1 > rec2[0] || xmax1 > rec2[2])
                    return true;
        }
        if (rec1[0] == rec2[0] && rec1[1] == rec2[1]){
            if (rec1[2] == rec2[2] && rec1[3] == rec2[3])
                return true;

        } 
        if (rec1[0] == rec2[2] && rec1[1] == rec2[3]){
            if (rec1[2] == rec2[0] && rec1[3] == rec2[1])
                return true;
        }

        if (rec1[0] > rec2[0] && rec1[1] > rec2[1]){
            if (rec1[2] < rec2[2] && rec1[3] < rec2[3])
                return true;

        } 
        if (rec1[0] < rec2[2] && rec1[1] < rec2[3]){
            if (rec1[2] > rec2[0] && rec1[3] > rec2[1])
                return true;
        }

        return false;
    }
}