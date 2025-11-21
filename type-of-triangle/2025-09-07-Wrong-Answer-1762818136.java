/*
 * Submission: 1762818136
 * Problem: Type of Triangle (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 15:42:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if (a+b <= c || b+c <= a || a+c <= b) return "none";
        if (a == b && b == c) return "equilateral";
        if (a == b || b == c || a == c) return "equilateral";
        return "scalene";
    }
}