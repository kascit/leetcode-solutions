/*
Submission: 1842624518
Status: Accepted
Timestamp: 2025-11-29 16:52:15 UTC
Runtime: 12 ms
Memory: 42.5 MB
*/

class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int i = num1; i <= num2; i++) {
            if (i < 101) continue; 

            int d0 = i % 10;        
            int d1 = (i / 10) % 10;  
            int j = i / 100;        

            while (j > 0) {
                int d2 = j % 10;

                if ((d1 < d0 && d1 < d2) || (d1 > d0 && d1 > d2))
                    ans++;

                d0 = d1;
                d1 = d2;
                j /= 10;
            }
        }
        return ans;
    }
}
