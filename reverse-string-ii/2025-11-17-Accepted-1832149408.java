/*
 * Submission: 1832149408
 * Problem: Reverse String II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:22:48 UTC
 * Runtime: 11 ms
 * Memory: 45 MB
 */

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        int len = s.length(), idx = 0;
        boolean first = true;
        for (int i = 0; i < len; i++) {
            if(first) {
                rev.append(s.charAt(i));                
            } else {
                ans.append(rev.reverse().toString());
                rev.setLength(0);
                ans.append(s.charAt(i));
            }
            idx++;
            if (idx%k == 0) first = !first;
        } 
        if (rev.length() > 0) ans.append(rev.reverse().toString());
        return ans.toString();
    }
}