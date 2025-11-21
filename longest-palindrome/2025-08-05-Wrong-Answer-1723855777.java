/*
 * Submission: 1723855777
 * Problem: Longest Palindrome (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-05 04:26:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
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
            else hasOdd = true;
        } return (ans+= (hasOdd) ? 1 : 0);
        
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