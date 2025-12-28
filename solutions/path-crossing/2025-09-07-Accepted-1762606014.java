/*
 * Submission: 1762606014
 * Problem: Path Crossing (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 11:50:31 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    public boolean isPathCrossing(String path) {
        int len = path.length();
        int v = 0, h = 0;
        // boolean[][] check = new boolean[len*2+1][len*2+1];
        Set<String> set = new HashSet<>();
        set.add("0,0");
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
            sb.append(v).append(",").append(h);
            if (!set.add(sb.toString())) {
                // System.out.println(sb.toString());
                return true;
            }
            sb.setLength(0);
            // if (check[v][h]) return true;
        } return false;
    }
}