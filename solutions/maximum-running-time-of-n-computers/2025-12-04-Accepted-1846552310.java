/*
Submission: 1846552310
Status: Accepted
Timestamp: 2025-12-04 06:58:30 UTC
Runtime: 15 ms
Memory: 74 MB
*/

class Solution {
  int N[];
  int n;
    public long maxRunTime(int n, int[] batteries) {
      this.n = n;
      this.N = batteries;
        long sum = 0;
        for (int b : batteries) sum += b;
        long r = (sum/n); 
        long l = 1;
        long ans = 0;
        while ( l <= r ) {
          long mid = l + (r - l) /2;
          // System.out.println(mid);
          if (isValid(mid)) {
          // System.out.println("valid");
            ans = mid;
            l = mid + 1;
          } else r = mid - 1;
        } return ans;
    }
    boolean isValid(long r) {
      long need = r * n;
      long could = 0;
      for (int c : N) {
        could += Math.min(c,r);
      }
          // System.out.println(r+" need: " +need + " could: " + could);
           return could >= need;
      
    }
}

