/*
 * Submission: 1745572954
 * Problem: Count Pairs That Form a Complete Day I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 16:03:35 UTC
 * Runtime: 3 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int countCompleteDayPairs(int[] hours) {
        Map<Integer,Integer> mapu = new HashMap<>();
        int ans = 0;
        for (int h : hours) {
            int cur = h%24;
            int sum = mapu.getOrDefault(24-cur,0);
            if (cur == 0) sum += mapu.getOrDefault(0,0);
            
            ans += sum;
            mapu.merge(cur,1,Integer::sum);
        } return ans;
    }
}