/*
 * Submission: 1745543231
 * Problem: Robot Return to Origin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:33:47 UTC
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