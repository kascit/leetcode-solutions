/*
Submission: 1837500238
Status: Wrong Answer
Timestamp: 2025-11-23 08:18:59 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, ans = 0, one = 40000, two = 40000;
        int sum = 0;
        for (int n : nums) sum += n;
        int rem = sum%3;
        if (rem == 0) return sum;
        for (int i = 0; i < len; i++) {
            if (one == 40000 && nums[i]%3 == rem) one = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (two == 40000 && (nums[i]+nums[j])%3 == rem) two = nums[i]+nums[j];
            }
            if (two != 40000 && one != 40000) break;
        }
        return sum - Math.min(one,two);
        
    }
}