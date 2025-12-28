/*
Submission: 1843070111
Status: Wrong Answer
Timestamp: 2025-11-30 05:46:48 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for (int n : nums) sum += n;
        int rem = sum%p;
        if (rem == 0) return 0;
        int len = nums.length;
        int[] pref = new int[len+1];
        for (int i = 1; i < len + 1; i++) {
            pref[i] = (pref[i-1] + nums[i-1])%p;
        }

        // cur - prev % p = rem
        int ans = Integer.MAX_VALUE;
        Map<Integer,Integer> prefToIdx = new HashMap<>();
        for (int l = 0; l < len + 1; l++) {
            int tillNowSum = pref[l];
            int prevReq = (tillNowSum-rem+p)%p;
            if (prefToIdx.containsKey(prevReq)){
                ans = Math.min(ans,l-prefToIdx.get(prevReq));
            }
            prefToIdx.put(tillNowSum,l);
        }
        // System.out.println(rem+" "+Arrays.toString(pref));
        return ans;
    }
}