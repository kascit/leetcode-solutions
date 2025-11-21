/*
 * Submission: 1762604695
 * Problem: Path Crossing (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 11:48:55 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPathCrossing(String path) {
        int len = path.length();
        int v = 0, h = 0;
        // boolean[][] check = new boolean[len*2+1][len*2+1];
        Set<String> set = new HashSet<>();
        set.add("00");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            // check[v][h] = true;
            char cur = path.charAt(i);
            if (cur == 'N') {
                v++;
            } else if ( cur == 'S') {
                v--;
            } else if (cur == 'E') {
                h++;
            } else h--;
            sb.append(v).append(h);
            if (!set.add(sb.toString())) return true;
            sb.setLength(0);
            // if (check[v][h]) return true;
        } return false;
    }
}