/*
 * Submission: 1753736199
 * Problem: Count the Number of Special Characters I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 15:49:18 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int numberOfSpecialChars(String s) {
        int a = 0, b = 0, len = s.length();
        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if(cur > 'Z') a |= 1<<cur-'a';
            else b |=1<<cur-'A';
        }
        a &=b;
        // if (a==0) return "";
        // System.out.println(Integer.toBinaryString(a));
        int ans = 0;
        while(a>0){
            ans++;
            a&=(a-1);
        } return ans;
    }
}
