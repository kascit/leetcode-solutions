/*
 * Submission: 1701066560
 * Problem: Find Indices of Stable Mountains (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 08:48:43 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < height.length - 1; i++){
            if (height[i] > threshold) ans.add(i+1);
        }
        return ans;
    }
}