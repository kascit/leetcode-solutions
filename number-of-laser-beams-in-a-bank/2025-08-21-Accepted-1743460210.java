/*
 * Submission: 1743460210
 * Problem: Number of Laser Beams in a Bank (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:57:27 UTC
 * Runtime: 40 ms
 * Memory: 45.6 MB
 */

import java.math.BigInteger;
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0;
        for(String s : bank) {
            BigInteger num = new BigInteger(s, 2);

            int count = num.bitCount();
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