/*
Submission: 1838264099
Status: Wrong Answer
Timestamp: 2025-11-24 06:31:07 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>(nums.length);
        int cur = 0;
        for(int i : nums){
            cur<<=1;
            cur|=i;
            // cur %= 10;
            ans.add(cur%5 == 0);
        } return ans;
    }
}
