/*
 * Submission: 1745552584
 * Problem: Count Substrings That Satisfy K-Constraint I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:43:18 UTC
 * Runtime: 2 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++){
            int ones = 0, zeros = 0;
            // StringBuilder sb = new StringBuilder();
            for (int j = i; j < len; j++){
                // sb.append(s.charAt(j));
                // System.out.println(sb.toString());
                if (s.charAt(j) == '0') zeros++; else ones++;
                if (ones <= k || zeros <= k) {
                    ans++; 
                } else break;
            }
        } return ans;
    }
}