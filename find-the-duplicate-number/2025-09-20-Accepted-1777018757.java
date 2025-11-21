/*
 * Submission: 1777018757
 * Problem: Find the Duplicate Number (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-20 13:07:57 UTC
 * Runtime: 4 ms
 * Memory: 58.3 MB
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            fast = nums[fast];
            slow = nums[slow];
        } return slow;
    }
}