/*
 * Submission: 1832148742
 * Problem: Reverse String II (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-17 09:21:53 UTC
 * Runtime: N/A
 * Memory: N/A
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
        } return ans.toString();
    }
}