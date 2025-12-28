/*
Submission: 1838265110
Status: Accepted
Timestamp: 2025-11-24 06:32:29 UTC
Runtime: 4 ms
Memory: 47.3 MB
*/

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>(nums.length);
        int cur = 0;
        for(int i : nums){
            cur<<=1;
            cur|=i;
            cur %= 5;
            ans.add(cur == 0);
        } return ans;
    }
}
