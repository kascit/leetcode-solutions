/*
 * Submission: 1809377656
 * Problem: Check If Digits Are Equal in String After Operations I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-23 11:38:18 UTC
 * Runtime: 9 ms
 * Memory: 45.2 MB
 */

class Solution {
    public boolean hasSameDigits(String s) {
        if (s.length() < 3) return isPalin(s);
        return isPalin(s) || hasSameDigits(convert(s));
    }

    private String convert(String s) {
        StringBuilder sb = new StringBuilder(s.length()-1);
        char prev = '*';
        for (char ch : s.toCharArray()) {
            if(prev != '*') sb.append( (char) (ch + prev - '0')%10 );
            // System.out.println(prev +"   "+ ch +"   "+ sb);
            prev = ch;
        }
         return sb.toString();
    }

    private boolean isPalin(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] != arr[r]) return false;
            l++; r--;
        } return true;
    }
}