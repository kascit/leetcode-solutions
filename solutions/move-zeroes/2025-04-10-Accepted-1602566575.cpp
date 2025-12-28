/*
 * Submission: 1602566575
 * Problem: Move Zeroes (Easy)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-04-10 10:20:25 UTC
 * Runtime: 0 ms
 * Memory: 23.9 MB
 */

class Solution {
public:
  void moveZeroes(vector<int>& nums) {
      for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.size(); cur++) {
          if (nums[cur] != 0) {
              swap(nums[lastNonZeroFoundAt++], nums[cur]);
          }
      }
  }
};