/*
 * Submission: 1723865354
 * Problem: Longest Palindrome (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 04:36:21 UTC
 * Runtime: 2 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int longestPalindrome(String s) {
        int ans = 0, max = 0;
        int[] freq = new int[52];
        boolean hasOdd = false;
        for (char ch : s.toCharArray()){
            int cur = ch;
            if (cur < 'a'){
                freq[cur-'A']++;
            } else {
                freq[cur-'a'+25]++;
            }
        }
        for (int i : freq){
            if ((i&1) == 0) ans += i;
            else {
                ans += (i>=3) ? i - 1 : 0;
                hasOdd = true;
            }
            
        } return (ans += (hasOdd) ? 1 : 0);
        
    }

    // boolean isPalin(String s){
    //     char[] str = s.toCharArray();
    //     int i = 0, j = str.length - 1;
    //     while(i<j){
    //         if (str[i++] != str[j--])
    //             return false;
    //     } return true;
    // }
}