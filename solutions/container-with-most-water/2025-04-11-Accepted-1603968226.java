/*
 * Submission: 1603968226
 * Problem: Container With Most Water (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 19:32:49 UTC
 * Runtime: 5 ms
 * Memory: 58.1 MB
 */

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = Integer.MIN_VALUE;
        while (left < right){
            int l = height[left], r = height[right];
            int area = Math.min(l,r) * (right-left);
            max = Math.max(area,max);
            if (l < r) left++;
            else right--;
        }
        return max;
    }
}