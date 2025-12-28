/*
 * Submission: 1738790073
 * Problem: Binary Prefix Divisible By 5 (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:19:47 UTC
 * Runtime: 3 ms
 * Memory: 45.9 MB
 */

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>(nums.length);
        int cur = 0;
        for(int i : nums){
            cur<<=1;
            cur|=i;
            cur %= 10;
            ans.add(cur == 0 || cur== 5);
        } return ans;
    }
}
