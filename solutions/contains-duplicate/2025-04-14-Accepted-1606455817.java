/*
 * Submission: 1606455817
 * Problem: Contains Duplicate (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:59:53 UTC
 * Runtime: 12 ms
 * Memory: 57.7 MB
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}