/*
 * Submission: 1832089942
 * Problem: Minimum Distance Between Three Equal Elements I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:55:40 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        ArrayList<Integer>[] pos = new ArrayList[n + 1];
        for (int i = 0; i < pos.length; i++) pos[i] = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pos[nums[i]].add(i);
        }

        for (ArrayList<Integer> list : pos) {
            int m = list.size();
            if (m < 3) continue;

            
            for (int i = 0; i < m - 2; i++) {
                for (int k = i + 2; k < m; k++) {
                    int dist = 2 * (list.get(k) - list.get(i));
                    ans = Math.min(ans, dist);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
