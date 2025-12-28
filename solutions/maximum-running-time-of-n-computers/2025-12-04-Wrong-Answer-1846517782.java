/*
Submission: 1846517782
Status: Wrong Answer
Timestamp: 2025-12-04 06:12:37 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  int N[];
  int n;
    public long maxRunTime(int n, int[] batteries) {
      this.n = n;
      this.N = batteries;
        int sum = 0;
        for (int b : batteries) sum += b;
        int r = sum/n; 
        int l = 1;
        int ans = 0;
        while ( l <= r ) {
          int mid = l + (r - l) /2;
          // System.out.println(mid);
          if (isValid(mid)) {
          // System.out.println("valid");
            ans = mid;
            l = mid + 1;
          } else r = mid - 1;
        } return ans;
    }
    boolean isValid(int r) {
      int need = r * n;
      int could = 0;
      for (int c : N) {
        could += Math.min(c,r);
      }
          // System.out.println(r+" need: " +need + " could: " + could);
           return could >= need;
      
    }
}

