/*
Submission: 1865700714
Status: Accepted
Timestamp: 2025-12-26 09:57:53 UTC
Runtime: 13 ms
Memory: 47.1 MB
*/

class Solution {
    public int bestClosingTime(String customers) {
        int[] pref = new int[customers.length()+1];
        int[] suff = new int[customers.length()+1];
        for (int i = 1; i < pref.length; i++) {
          pref[i] = pref[i-1] + ((customers.charAt(i-1) == 'N') ? 1 : 0);
        }
        for (int i = pref.length - 2; i >= 0; i--) {
          suff[i] = suff[i+1] + ((customers.charAt(i) == 'Y') ? 1 : 0);
        }
        int time = 0, min = pref.length;
        for (int i = 0; i < pref.length; i++) {
          int cur = suff[i] + pref[i];
          if (cur < min) {
            min = cur;
            time = i;
          }
        } return time;
        // System.out.println(Arrays.toString(suff));
        // System.out.println(Arrays.toString(pref));
        // return -1;
    }
}