/*
Submission: 1845139012
Status: Accepted
Timestamp: 2025-12-02 15:34:36 UTC
Runtime: 254 ms
Memory: 52.6 MB
*/

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
      List<List<Integer>> ans = new ArrayList<>();
      if (n == 1) return ans;
        boolean[] notPrime = new boolean[n+1];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < n + 1; i++) {
          for (int j = i + i; j < n + 1; j += i) {
            notPrime[j] = true;
          }
        }
        // System.out.println
        if (!notPrime[2] && !notPrime[n-2]) {
          ans.add(List.of(2,n-2));
        }
        for (int i = 3; i <= n/2; i+=2) {
          if (!notPrime[i] && !notPrime[n-i]) {
            ans.add(List.of(i,n-i));
          }
        } return ans;
    }
}