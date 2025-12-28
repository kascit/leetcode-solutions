/*
Submission: 1848300825
Status: Accepted
Timestamp: 2025-12-06 12:21:11 UTC
Runtime: 25 ms
Memory: 46 MB
*/

class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (canPartition(String.valueOf(sq), 0, i)) {
                ans += sq;
            }
        }
        return ans;
    }

    private boolean canPartition(String s, int index, int target) {
        if (target < 0) return false;
        if (index == s.length()) return target == 0;

        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (canPartition(s, j + 1, target - num)) return true;
        }
        return false;
    }
}
