/*
 * Submission: 1723880308
 * Problem: Valid Palindrome II (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-08-05 04:50:50 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean validPalindrome(String s) {
        if (isPalin(s)) return true;
        int len = s.length();
        int l = 0, r = len - 1;
        while(l<r){
            if ( isPalin(s.substring(0,l)+s.substring(l+1)) ) return true;
            else if ( isPalin(s.substring(0,r)+s.substring(r+1,len)) ) return true;
            l++;
            r--;

        } 
        return false;
    }

    boolean isPalin(String s){
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;
        while(i<j){
            if (str[i++] != str[j--])
                return false;
        } return true;
    }
}