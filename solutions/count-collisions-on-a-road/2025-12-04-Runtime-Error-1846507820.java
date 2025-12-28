/*
Submission: 1846507820
Status: Runtime Error
Timestamp: 2025-12-04 05:59:06 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int countCollisions(String directions) {
        int ans = 0;
        int l = 0, r = directions.length() - 1;
        while (directions.charAt(l) == 'L') l++;
        while (directions.charAt(r) == 'R') r--;
        for (int i = l; i <= r; i++) if (directions.charAt(i) != 'S') ans++;
        return ans;
    }
}