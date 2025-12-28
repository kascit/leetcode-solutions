/*
Submission: 1842618270
Status: Accepted
Timestamp: 2025-11-29 16:43:26 UTC
Runtime: 12 ms
Memory: 42.7 MB
*/

class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            if (i < 101) continue;
            int prev2 = -1, prev1 = -1;
            for(int j = i; j > 0; j /= 10) {
                int cur = j%10;
                if (prev2 == -1) {
                    prev2 = cur;
                    continue;
                } else if (prev1 == -1) {
                    prev1 = cur;
                    continue;
                } else {
                    if ((prev1 < cur && prev1 < prev2) || (prev1 > cur && prev1 > prev2)) {
                        ans++;
                    }
                    prev2 = prev1;
                    prev1 = cur;
                }
            }
        } return ans;
    }
}