/*
 * Submission: 1757998268
 * Problem: Count Triplets That Can Form Two Arrays of Equal XOR (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 08:40:41 UTC
 * Runtime: 27 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int countTriplets(int[] arr) {
        int len = arr.length, cur = 0;
        int[] pref = new int[len+1];
        for (int i = 1; i <= len; i++) {
            cur ^= arr[i-1];
            pref[i] = cur;
        }
        System.out.println(Arrays.toString(pref));
        int ans = 0;
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                for (int k = j; k <= len; k++) {
                    if ( (pref[i-1]^pref[j-1]) == (pref[k]^pref[j-1]) ) {
                        ans++;
                        // System.out.println(i-1+"  "+(j-1)+"  "+(k-1));
                    }
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