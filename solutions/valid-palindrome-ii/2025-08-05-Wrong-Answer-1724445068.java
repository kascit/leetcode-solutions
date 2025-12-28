/*
 * Submission: 1724445068
 * Problem: Valid Palindrome II (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-05 14:04:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int len = s.length();

        if (len < 7){
            if (isPalin(s)) return true;

        for(int i = 0; i < len; i++){
            if ( isPalin(s.substring(0,i)+s.substring(i+1)) ) return true;
        } return false;
    }

    

        int i = 0, j = len - 1;
        boolean once = false, movi = false, movj = false;
        int deli = i, delj = j;
        while (i < j) {
            if (str[i] != str[j]) {
                if (once) return false;
                System.out.println(i + " " + j);
                if (str[i+1] == str[j]) {
                    deli = i;
                    movi = true;
                }
                System.out.println(i + " " + j);
                if (str[i] == str[j - 1]) {
                    delj = j;
                    movj = true;
                }
                System.out.println(i + " " + j);
                if (movi && str[deli + 2] == str[j-1]) {
                    i = deli;
                    j++;
                    System.out.println(i + " " + j);
                } else if (movj && str[delj - 2] == str[i+1]){
                    j = delj;
                    i--;
                    System.out.println(i + " " + j);
                } else return false;
                System.out.println(i + " " + j);
                once = true;
            }
            i++;
            j--;
        }
        return true;
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