/*
 * Submission: 1762344834
 * Problem: Count Binary Substrings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 06:42:15 UTC
 * Runtime: 8 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int countBinarySubstrings(String s) {
        int len = s.length(), ans = 0;
        char f = s.charAt(0);
        int fc = 1, oc = 0;
        boolean first = true;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == f) {
                if(first && oc != 0) {
                    ans += Math.min(fc,oc);
                    fc = 0;
                    first = !first;
                }
                fc++;
            }
            else {
                if(!first && fc != 0) {
                    ans += Math.min(fc,oc);
                    oc = 0;
                    first = !first;
                }
                oc++;
            }
            if (i == len - 1) ans += Math.min(oc,fc);
            // System.out.println(i+"    fc: "+fc+"    oc: "+oc +"   ans:" + ans);
        } return ans;
    }
}