/*
 * Submission: 1753043362
 * Problem: Check if Number Has Equal Digit Count and Digit Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 03:59:40 UTC
 * Runtime: 1 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean digitCount(String num) {
        int[] f = new int[10];
        int len = num.length();
        for(int i = 0; i < len; i++) {
            f[num.charAt(i)-'0']++;
        }
        for(int i = 0; i < len; i++) {
            if(f[i] != Integer.parseInt(String.valueOf(num.charAt(i)))) return false;
        } return true;


    }
}