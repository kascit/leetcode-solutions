/*
Submission: 1843501577
Status: Time Limit Exceeded
Timestamp: 2025-11-30 16:45:33 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        char[] arc = s.toCharArray();
        int len = arc.length;
        // int lim = (int)(1+Math.sqrt(len));
        int[] pre = new int[len+1];
        for (int i = 0; i < len; i++) {
            pre[i+1] = pre[i] + (arc[i] == '0' ? 1 : 0);
        }
        for(int l = 0; l < len; l++) {
            int lim = (int)Math.sqrt(len - l);
            // int ones = 0, curlen = 0, zeros = 0;
            for (int r = l; r < len; r++) {
                int zeros = pre[r+1] - pre[l];
                int curlen = r - l + 1;
                // zeros = curlen - ones;
                if (zeros > lim) break;
                if (zeros == 0 || curlen >= zeros*zeros+zeros) ans++;
            }
        } return ans;
    }
}