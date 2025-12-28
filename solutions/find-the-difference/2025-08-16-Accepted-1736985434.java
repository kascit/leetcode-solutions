/*
 * Submission: 1736985434
 * Problem: Find the Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:42:19 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    static{
        for(int i=0;i<=300;i++)
            findTheDifference("abc", "abcd");
    }
    public static char findTheDifference(String s, String t) {
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