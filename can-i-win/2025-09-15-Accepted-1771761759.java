/*
 * Submission: 1771761759
 * Problem: Can I Win (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 15:58:09 UTC
 * Runtime: 365 ms
 * Memory: 90.2 MB
 */

class Solution {
    int picky, sum;
    Map<Integer,Boolean> map;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        this.picky = maxChoosableInteger;
        this.sum = desiredTotal;
        this.map = new HashMap<>();
        if (picky * (picky + 1) / 2 < sum) return false;
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
                curSum += i+1;
                if (curSum >= sum) {
                    map.put(picked,true);
                    return true;
                } else {
                    boolean canHeWin = recur(picked|cur);
                    if (!canHeWin) {
                        map.put(picked,true);
                        return true;
                    }
                }
                curSum -= (i+1);
            }
        }
        map.put(picked,false);
        return false;
    }
}