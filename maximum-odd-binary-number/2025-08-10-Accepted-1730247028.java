/*
 * Submission: 1730247028
 * Problem: Maximum Odd Binary Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:10:57 UTC
 * Runtime: 2 ms
 * Memory: 43.4 MB
 */

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()){
            if (ch == '1') count++;
        }
        while(count-->1){
            sb.append("1");
        }
        int sbl = sb.length();
        while(len-sbl>1){
            sb.append("0");
            len--;
        }
        return sb.append("1").toString();
    }
}