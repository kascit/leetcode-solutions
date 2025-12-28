/*
Submission: 1848297594
Status: Wrong Answer
Timestamp: 2025-12-06 12:15:11 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        if (n >= 10) ans += 100;
        if (n >= 100) ans += 10000;
        if (n >= 1000) ans += 1000000;
        for (int i = 1; i <= n; i++) {
          if (poss(i)) {
            ans += i * i;
          } 
        } return ans;
    }

    boolean poss(int n) {
      int tenPow = 1;
      int temp = n * n;
      while (tenPow * 10 <= temp) tenPow *= 10;
      boolean fuck = bt(n, n * n, 0, 0, tenPow);
      // System.out.println("================================================================");
      return fuck;
    }

    boolean bt (int i, int sq, int endHere, int contChain, int tenPow) {
      // System.out.println("number: " + i + "\tRemaing: " + sq + "\tEndhere: " + endHere + "\tchain: " + contChain + "\ttenPow: " + tenPow);
      if (sq == 0) {
        if (endHere + contChain == i) return true;
        return false;
      }
      contChain *= 10;
      int curInt = sq / tenPow;
      sq %= tenPow;
      tenPow /= 10;
      boolean end = bt( i,  sq, endHere + contChain + curInt  ,  0                 ,  tenPow);
      boolean cont = bt(i,  sq, endHere,                         contChain + curInt,  tenPow);

      return end || cont;
    }
}