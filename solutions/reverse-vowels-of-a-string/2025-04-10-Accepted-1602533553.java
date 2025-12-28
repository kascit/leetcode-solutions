/*
 * Submission: 1602533553
 * Problem: Reverse Vowels of a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:34:58 UTC
 * Runtime: 3 ms
 * Memory: 45 MB
 */

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] ss = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while ( l < r ){
            if(vowels.indexOf(ss[l]) != -1){
                if( vowels.indexOf(ss[r]) != -1 ){
                    char temp = ss[l];
                    ss[l] = ss[r];
                    ss[r] = temp;
                    l++;
                    r--;
                } else r--;
                
            } else l++;
            
        }
        return new String(ss);
    }
}