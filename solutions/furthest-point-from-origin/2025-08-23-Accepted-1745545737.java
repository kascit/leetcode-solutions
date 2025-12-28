/*
 * Submission: 1745545737
 * Problem: Furthest Point From Origin (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:36:17 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int dist = 0, c = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') dist++;
            else if (ch == 'R') dist--;
            else c++;
        }
        if (dist < 0) dist *= -1;
        return dist + c;
    }
}