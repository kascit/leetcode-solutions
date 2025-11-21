/*
 * Submission: 1738768604
 * Problem: Convert a Number to Hexadecimal (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 17:00:50 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String toHex(int n) {
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