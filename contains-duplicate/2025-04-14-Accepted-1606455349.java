/*
 * Submission: 1606455349
 * Problem: Contains Duplicate (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:59:18 UTC
 * Runtime: 25 ms
 * Memory: 58.7 MB
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}