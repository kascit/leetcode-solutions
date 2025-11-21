/*
 * Submission: 1761330274
 * Problem: Find the Distance Value Between Two Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 09:52:59 UTC
 * Runtime: 3 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int[] frfr = new int[2001];
        for (int n : arr2) {
            frfr[n+1000] = 1;
        }
        int ans = 0;
        outer : for(int n : arr1) {
            for (int i = -d; i <=d; i++) {
                if (n+1000+i >= 0 && n+1000+i < 2001 && frfr[n+1000+i] == 1) continue outer;
            }
            ans++;
        } return ans;
    }
}