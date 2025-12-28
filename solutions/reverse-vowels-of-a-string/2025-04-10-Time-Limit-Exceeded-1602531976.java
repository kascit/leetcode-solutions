/*
 * Submission: 1602531976
 * Problem: Reverse Vowels of a String (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-10 09:32:42 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] ss = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while ( l < r ){
            if(vowels.indexOf(ss[l]) != -1 && vowels.indexOf(ss[r]) != -1 ){
                char temp = ss[l];
                ss[l] = ss[r];
                ss[r] = temp;
            }
        }
        return new String(ss);
    }
}