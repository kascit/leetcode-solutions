/*
 * Submission: 1723192796
 * Problem: Largest Number (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 14:56:52 UTC
 * Runtime: 10 ms
 * Memory: 44.6 MB
 */

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] ns = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(ns, (a, b) -> ("" + b + a).compareTo("" + a + b));
        StringBuilder sb = new StringBuilder();
        boolean hasNonZero = false;
        for (Integer num : ns) {
            sb.append(num);
            if (!hasNonZero && num != 0){
                hasNonZero = true;
            }
        } if (!hasNonZero) return "0";
        return sb.toString();
    }
}