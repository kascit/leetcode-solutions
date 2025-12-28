/*
 * Submission: 1762866866
 * Problem: Number of Equivalent Domino Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:29:29 UTC
 * Runtime: 16 ms
 * Memory: 57.2 MB
 */

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];
            if (b > a) {
                int t = a;
                a = b;
                b = t;
            }
            sb.append(a).append(b);
            String cur = sb.toString();
            int c = map.getOrDefault(cur,0);
            ans += c;
            map.put(cur,c+1);
            sb.setLength(0);
        } return ans;
    }
}