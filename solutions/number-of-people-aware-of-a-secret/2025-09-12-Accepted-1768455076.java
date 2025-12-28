/*
 * Submission: 1768455076
 * Problem: Number of People Aware of a Secret (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-12 16:33:19 UTC
 * Runtime: 43 ms
 * Memory: 43.3 MB
 */

class Solution {
    int MOD = (int) 1e9 + 7;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        Queue<int[]> dayPeople = new LinkedList<>();
        dayPeople.offer(new int[]{1, 1}); 
        
        for (int day = 2; day <= n; day++) {
            long totalNew = 0;

            while (!dayPeople.isEmpty() && dayPeople.peek()[0] + forget == day) {
                dayPeople.poll();
            }


            for (int[] dp : dayPeople) {
                if (dp[0] + delay <= day && day < dp[0] + forget) {
                    totalNew = (totalNew + dp[1]) % MOD;
                }
            }

            if (totalNew > 0) {
                dayPeople.offer(new int[]{day, (int) totalNew});
            }
        }

        long ans = 0;
        for (int[] dp : dayPeople) {
            ans = (ans + dp[1]) % MOD;
        }
        return (int) ans;
    }
}
