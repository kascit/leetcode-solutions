/*
 * Submission: 1737044093
 * Problem: Binary Gap (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:49:51 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int binaryGap(int n) {
        if ( (n&(n-1)) == 0 ) return 0;
        int max = 0, cur = 0, last = -1, valid = 0;
        while(n > 0){
            cur++;

            if ((n&1) == 1){
                if (last != -1){
                    valid = cur - last;
                    max = (max > valid) ? max : valid;
                }
                last = cur;
            }

            n >>= 1;
        } return max;
    }
}