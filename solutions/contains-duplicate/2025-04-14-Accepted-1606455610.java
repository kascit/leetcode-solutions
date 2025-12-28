/*
 * Submission: 1606455610
 * Problem: Contains Duplicate (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:59:37 UTC
 * Runtime: 16 ms
 * Memory: 56.8 MB
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}