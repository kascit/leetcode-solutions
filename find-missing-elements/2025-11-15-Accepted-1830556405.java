/*
 * Submission: 1830556405
 * Problem: Find Missing Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:27:06 UTC
 * Runtime: 5 ms
 * Memory: 46.7 MB
 */

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> anss = new ArrayList<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
            ans.add(n);
        }
        int len = nums.length;
        for(int i = min; i <= max; i++) {
            if(!ans.contains(i)) anss.add(i);
        } return anss;
    }
}