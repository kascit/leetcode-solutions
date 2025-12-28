/*
Submission: 1845144247
Status: Accepted
Timestamp: 2025-12-02 15:40:53 UTC
Runtime: 104 ms
Memory: 52.4 MB
*/

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {

        List<List<Integer>> ans = new ArrayList<>();
        if (n < 4) return ans;

        boolean[] notPrime = new boolean[n + 1];


        for (int i = 2; i * i <= n; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    notPrime[j] = true;
                }
            }
        }


        if (!notPrime[2] && !notPrime[n - 2])
            ans.add(List.of(2, n - 2));

        for (int p = 3; p <= n / 2; p += 2) {
            if (!notPrime[p] && !notPrime[n - p]) {
                ans.add(List.of(p, n - p));
            }
        }

        return ans;
    }
}
