/*
 * Submission: 1745543643
 * Problem: Robot Return to Origin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:34:12 UTC
 * Runtime: 4 ms
 * Memory: 44.8 MB
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int vert = 0, horz = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') horz++;
            else if (ch == 'R') horz--;
            else if (ch == 'U') vert++;
            else vert--;
        }
        return horz == 0 && vert == 0;
    }
}