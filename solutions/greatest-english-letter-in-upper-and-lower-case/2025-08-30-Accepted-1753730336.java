/*
 * Submission: 1753730336
 * Problem: Greatest English Letter in Upper and Lower Case (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 15:46:08 UTC
 * Runtime: 3 ms
 * Memory: 42 MB
 */

class Solution {
    public String greatestLetter(String s) {
        int a = 0, b = 0, len = s.length();
        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur > 'Z') a |= 1<<cur-'a';
            else b |=1<<cur-'A';
        }
        a &=b;
        if (a==0) return "";
        // System.out.println(Integer.toBinaryString(a));
        char ans = 64;
        while(a>0){
            ans++;
            a>>=1;
        } return Character.toString(ans);
    }
}