/*
 * Submission: 1706090285
 * Problem: Count Pairs Whose Sum is Less than Target (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-21 15:08:41 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int low = 0, n = nums.size(),  high = n - 1;
        int ans = -1, cnt = 0;
        while(low <= high){
            int mid = low + (high - low) /2;
            int cur = nums.get(mid);
            if (cur < target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (ans == -1) return 0;

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (nums.get(i) + nums.get(j) >= target) break;
                else cnt++;
            }
        }
        return cnt;
    }
}