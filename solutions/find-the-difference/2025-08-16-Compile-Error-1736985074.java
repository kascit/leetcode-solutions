/*
 * Submission: 1736985074
 * Problem: Find the Difference (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-08-16 07:41:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    static{
        for(int i=0;i<=300;i++)
            findTheDifference("abc", "abcd");
    }
    public char findTheDifference(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }
        int ans = 0;
        for (char ch : s.toCharArray()){
            ans ^= ch;
        }
        for (char ch : t.toCharArray()){
            ans ^= ch;
        }
        return (char)ans;
    }
}