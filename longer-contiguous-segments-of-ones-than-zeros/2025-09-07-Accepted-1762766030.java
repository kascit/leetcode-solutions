/*
 * Submission: 1762766030
 * Problem: Longer Contiguous Segments of Ones than Zeros (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 14:46:07 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public boolean checkZeroOnes(String s) {
        int len = s.length(), oc = 0, zc = 0, om = 0, zm = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                zc = 0;
                oc++;
                if (oc > om) om = oc;
            } else {
                oc = 0;
                zc++;
                if (zc > zm) zm = zc;
            }
        } return om > zm;
    }
}