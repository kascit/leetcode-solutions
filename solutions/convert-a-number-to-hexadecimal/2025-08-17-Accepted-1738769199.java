/*
 * Submission: 1738769199
 * Problem: Convert a Number to Hexadecimal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:01:19 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public String toHex(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        long num = n;
        if (num < 0) num = (long)(Math.pow(2,32) + num);
        // System.out.println(num);
        while(num > 0){
            long cur = num%16;
            if (cur < 10)
                sb.insert(0,cur);
            else 
                sb.insert(0,(char)(cur-10+'a'));
            num /= 16;
        } return sb.toString();
    }
}