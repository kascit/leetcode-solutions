/*
 * Submission: 1735966315
 * Problem: Sum of Unique Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 10:23:09 UTC
 * Runtime: 2 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        Set<Integer> Sset = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
        if (set.contains(n)) set.remove(n);
        if (!Sset.contains(n) && !set.contains(n)) set.add(n);
        Sset.add(n);
        }
        for(int n : set){
            ans += n;
        } return ans;
    }
}