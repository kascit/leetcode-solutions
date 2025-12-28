/*
Submission: 1852210732
Status: Accepted
Timestamp: 2025-12-10 16:57:42 UTC
Runtime: 30 ms
Memory: 59.1 MB
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
          if (i > 0 && nums[i] == nums[i-1]) continue;
          int l = i + 1;
          int r = n - 1;
          while ( l < r ) {
            int sum = nums[i] + nums[l] + nums[r];
            if (sum > 0) r--;
            else if (sum < 0) l++;
            else {
              ans.add(List.of(nums[i],nums[l],nums[r]));
              while (l+1 < n && nums[l++] == nums[l]);
              while (r > 0 && nums[r--] == nums[r]);
              // l++; r--;
            }
          }
        } return ans;
    }
}