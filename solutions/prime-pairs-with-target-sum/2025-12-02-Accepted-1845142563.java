/*
Submission: 1845142563
Status: Accepted
Timestamp: 2025-12-02 15:38:50 UTC
Runtime: 257 ms
Memory: 54 MB
*/

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
      List<List<Integer>> ans = new ArrayList<>();
      if (n < 4) return ans;
        boolean[] notPrime = new boolean[n+1];
        notPrime[0] = true;
        notPrime[1] = true;
        int l = (int)(1+ Math.sqrt(n));
        for (int i = 2; i <= l ; i++) {
          for (int j = i + i; j < n + 1; j += i) {
            notPrime[j] = true;
          }
        }
        // System.out.println
        if (!notPrime[2] && !notPrime[n-2]) {
            ans.add(Arrays.asList(2,n-2));
        }
        for (int i = 3; i <= n/2; i+=2) {
          if (!notPrime[i] && !notPrime[n-i]) {
            ans.add(Arrays.asList(i,n-i));
          }
        } return ans;
    }
}