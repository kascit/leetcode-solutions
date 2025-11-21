/*
 * Submission: 1762588474
 * Problem: Find All Numbers Disappeared in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 11:29:17 UTC
 * Runtime: 22 ms
 * Memory: 64.5 MB
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 1; i <= len; i++) set.add(i);
        for (int n : nums) set.remove(n);
        return new ArrayList<>(set);
    }
}