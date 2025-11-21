/*
 * Submission: 1746735269
 * Problem: Keep Multiplying Found Values by Two (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:55:12 UTC
 * Runtime: 4 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(original)){
            original*=2;
        } return original;
    }
}