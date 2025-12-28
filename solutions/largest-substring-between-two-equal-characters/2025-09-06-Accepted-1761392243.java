/*
 * Submission: 1761392243
 * Problem: Largest Substring Between Two Equal Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:07:50 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] dis = new int[26];
        int[] c = new int[26];
        Arrays.fill(dis,-1);
        int len = s.length();
        int max = -1;
        for (int i = 0; i < len; i++) {
            int cur = s.charAt(i) - 'a';
            if (dis[cur] == -1) dis[cur] = i;
            else {
                c[cur] = i;
                max = Math.max(max,c[cur]-dis[cur] - 1);
            }
        } return max;
    }
}