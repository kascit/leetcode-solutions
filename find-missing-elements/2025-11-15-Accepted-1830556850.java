/*
 * Submission: 1830556850
 * Problem: Find Missing Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:27:37 UTC
 * Runtime: 3 ms
 * Memory: 46.9 MB
 */

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num : nums) {
            set.add(num);
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = min + 1; i < max; i++) {
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}