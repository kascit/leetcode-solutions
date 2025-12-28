/*
 * Submission: 1744515428
 * Problem: Lexicographically Smallest Palindrome (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 16:02:17 UTC
 * Runtime: 8 ms
 * Memory: 45.4 MB
 */

class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = sb.length()-1;
        while(l < r) {
            char lef = sb.charAt(l);
            char rig = sb.charAt(r);
            if (lef != rig){
                char min = (lef < rig) ? lef : rig;
                sb.setCharAt(l,min);
                sb.setCharAt(r,min);
            }
            l++;
            r--;
        } return sb.toString();
    }
}