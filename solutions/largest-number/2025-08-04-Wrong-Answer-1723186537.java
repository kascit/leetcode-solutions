/*
 * Submission: 1723186537
 * Problem: Largest Number (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-04 14:51:37 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] ns = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(ns, (a, b) -> ("" + b + a).compareTo("" + a + b));
        StringBuilder sb = new StringBuilder();
        for (Integer num : ns) sb.append(num);
        return sb.toString();
    }
}