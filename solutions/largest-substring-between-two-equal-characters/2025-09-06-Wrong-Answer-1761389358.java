/*
 * Submission: 1761389358
 * Problem: Largest Substring Between Two Equal Characters (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-06 11:04:20 UTC
 * Runtime: N/A
 * Memory: N/A
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
                dis[cur] = i - dis[cur] - 1 + c[cur];
                max = Math.max(max,dis[cur]);
                c[cur]++;
            }
        } return max;
    }
}