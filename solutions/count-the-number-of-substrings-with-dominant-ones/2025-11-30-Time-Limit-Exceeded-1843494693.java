/*
Submission: 1843494693
Status: Time Limit Exceeded
Timestamp: 2025-11-30 16:35:56 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        char[] arc = s.toCharArray();
        int len = arc.length;
        int lim = (int)(1+Math.sqrt(len));
        for(int l = 0; l < len; l++) {
            int ones = 0, curlen = 0, zeros = 0;
            for (int r = l; r < len; r++) {
                ones += arc[r] - '0';
                curlen++;
                zeros = curlen - ones;
                if (zeros > lim) break;
                if (ones >= zeros*zeros) ans++;
            }
        } return ans;
    }
}