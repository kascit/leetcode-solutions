/*
 * Submission: 1702282737
 * Problem: Check if One String Swap Can Make Strings Equal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 09:57:53 UTC
 * Runtime: 1 ms
 * Memory: 41.4 MB
 */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int[] freq = new int[26];
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
            if(s1.charAt(i) != s2.charAt(i) )cnt++;
        }
        for (int i = 0; i < 26; i++){
            if (freq[i] != 0) return false;
        }
        //System.out.println(cnt);
        return true && cnt < 3;
    }
}