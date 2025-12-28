/*
 * Submission: 1743456785
 * Problem: Number of Laser Beams in a Bank (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-21 16:54:46 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0;
        for(String s : bank) {
            int n = Integer.parseInt(s,2);
            int count = Integer.bitCount(n);
            // while (n > 0) {
            //     n &= (n - 1);
            //     count++;
            // }
            ans += count*prev;
            // System.out.println(prev+"   "+count+"   "+ans);
            if (count > 0) prev = count;
        }
        return ans;
    }
}