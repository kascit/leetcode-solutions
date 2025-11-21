/*
 * Submission: 1764604731
 * Problem: Number of People Aware of a Secret (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-09 06:13:34 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    int MOD = (int) 1e9 + 7;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        Queue<int[]> dayPeople = new LinkedList<>();
        dayPeople.offer(new int[]{1,1});
        long totalNew = 1;
        for (int i = 2; i <= n; i++) {
            totalNew = 0;
            for (int[] dp : dayPeople) {
                System.out.println("Day: " + dp[0] + " had ppl: "+dp[1]);
                if (dp[0] + forget <= i) {
                    totalNew -= dp[1] % MOD;
                }
                if (dp[0] + delay >= i) {
                    totalNew += dp[1] % MOD;
                }
            }
            System.out.println("Day: " + i + " ppl: "+totalNew+"\n");
            dayPeople.offer(new int[]{i,(int)totalNew});
        } return (int)totalNew;
    }
}

