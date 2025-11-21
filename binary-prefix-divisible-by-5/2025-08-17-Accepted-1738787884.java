/*
 * Submission: 1738787884
 * Problem: Binary Prefix Divisible By 5 (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:17:52 UTC
 * Runtime: 4 ms
 * Memory: 46.1 MB
 */

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int cur = 0;
        for(int i : nums){
            cur*=2;
            cur+=i;
            cur %= 10;
            ans.add(cur == 0 || cur== 5);
        } return ans;
    }
}
