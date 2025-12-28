/*
Submission: 1848288209
Status: Wrong Answer
Timestamp: 2025-12-06 11:57:20 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
          if (bt(i,i*i,0,0,1)) {ans += i * i;}
        } return ans;
    }

    boolean bt(int n, int copy, int curSum, int chain, int order) {
      // System.out.println("n: " + n + " copy: " + copy + " curSum: " + curSum + " chain: " + chain);
      // System.out.println("=======================================================================");
      if (copy == 0) {
        if (curSum + chain == n) return true;
        return false;
      }
      // chain *= 10;
      int shit = copy % 10;
      return 
      bt(n,copy/10,curSum + shit + chain, 0,order)
      ||
      bt(n,copy/10,curSum,chain + shit*order,order*10);
    }
}