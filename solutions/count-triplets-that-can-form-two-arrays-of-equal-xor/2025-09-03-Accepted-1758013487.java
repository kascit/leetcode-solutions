/*
 * Submission: 1758013487
 * Problem: Count Triplets That Can Form Two Arrays of Equal XOR (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 08:59:46 UTC
 * Runtime: 2 ms
 * Memory: 42 MB
 */

class Solution {
    public int countTriplets(int[] arr) {
        int len = arr.length, cur = 0;
        int[] pref = new int[len+1];
        for (int i = 1; i <= len; i++) {
            cur ^= arr[i-1];
            pref[i] = cur;
        }
        // System.out.println(Arrays.toString(pref));
        int ans = 0;
        for (int i = 1; i < len; i++) {

                for (int k = i+1; k <= len; k++) {
                    if ( (pref[i-1]) == (pref[k]) ) {
                        ans+=k-i;
                        // System.out.println(i-1+"  "+(j-1)+"  "+(k-1));
                    }
                }
        } return ans;
    }
}
/*
1 2 3 4 5 6 7
. . i
. . . . j
. . . . . . k
*/