/*
Submission: 1852218063
Status: Wrong Answer
Timestamp: 2025-12-10 17:05:25 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      for (int j = i + 1; j < n - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1])
          continue;
        int l = j + 1;
        int r = n - 1;
        while (l < r) {
          long sum = nums[i] + nums[j] + nums[l] + nums[r];
          if (sum > target)
            r--;
          else if (sum < target)
            l++;
          else {
            ans.add(List.of(nums[i], nums[j], nums[l], nums[r]));
            while (l + 1 < n && nums[l++] == nums[l])
              ;
            while (r > 0 && nums[r--] == nums[r])
              ;
            // l++; r--;
          }
        }
      }
    }
    return ans;
  }
}