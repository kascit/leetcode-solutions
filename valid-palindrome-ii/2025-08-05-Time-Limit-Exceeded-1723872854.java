/*
 * Submission: 1723872854
 * Problem: Valid Palindrome II (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-08-05 04:43:46 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean validPalindrome(String s) {
        if (isPalin(s)) return true;
        int len = s.length();
        for(int i = 0; i < len; i++){
            if ( isPalin(s.substring(0,i)+s.substring(i+1)) ) return true;
        } return false;
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