/*
 * Submission: 1603974011
 * Problem: Max Number of K-Sum Pairs (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 19:41:55 UTC
 * Runtime: 37 ms
 * Memory: 55.7 MB
 */

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}