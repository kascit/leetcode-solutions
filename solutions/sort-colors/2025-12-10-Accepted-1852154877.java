/*
Submission: 1852154877
Status: Accepted
Timestamp: 2025-12-10 15:57:54 UTC
Runtime: 0 ms
Memory: 43.5 MB
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
          int cur = nums[mid];
          if (cur == 0) {
            nums[mid] = nums[low];
            nums[low] = cur;
            low++; mid++;
          } else if (cur == 2) {
            nums[mid] = nums[high];
            nums[high] = cur;
            high--;
          } else mid++;
        }
    }
}