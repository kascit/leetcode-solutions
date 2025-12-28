/*
 * Submission: 1771756326
 * Problem: Can I Win (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-15 15:53:21 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    int picky, sum;
    Map<Integer,Boolean> map;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        this.picky = maxChoosableInteger;
        this.sum = desiredTotal;
        this.map = new HashMap<>();
        return recur(0);
    }
    private boolean recur(int picked) {
        if (map.containsKey(picked)) return map.get(picked);
        int curSum = 0, val = 1, n = picked;
        while (n > 0) {
            curSum += val*(n&1);
            n>>=1;
            val++;
        }
        // if (curSum >= sum) {
        //     return true;
        // }
        for (int i = 0; i < picky; i++) {
            int cur = 1<<i;
            if ( (picked & cur) == 0) {
                curSum += cur;
                if (curSum >= sum) {
                    map.put(picked|cur,true);
                    return true;
                } else {
                    boolean canHeWin = recur(picked|cur);
                    if (canHeWin) return false;
                }
                curSum -= cur;
            }
        }
        return false;
    }
}