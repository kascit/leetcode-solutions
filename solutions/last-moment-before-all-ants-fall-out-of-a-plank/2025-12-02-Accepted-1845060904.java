/*
Submission: 1845060904
Status: Accepted
Timestamp: 2025-12-02 13:55:16 UTC
Runtime: 0 ms
Memory: 46.8 MB
*/

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = 0;
        for (int l : left) {
          ans = Math.max(ans,l);
        }
        for (int r : right) {
          ans = Math.max(ans,n-r);
        } return ans;
    }
}