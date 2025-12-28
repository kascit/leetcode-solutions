/*
 * Submission: 1702275669
 * Problem: Check if One String Swap Can Make Strings Equal (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 09:50:18 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)) cnt++;
        }
        //System.out.println(cnt);
        return cnt <= 2;
    }
}