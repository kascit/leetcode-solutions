/*
 * Submission: 1753043959
 * Problem: Check if Number Has Equal Digit Count and Digit Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:00:41 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public boolean digitCount(String num) {
        int[] f = new int[10];
        int len = num.length();
        for(int i = 0; i < len; i++) {
            f[num.charAt(i)-'0']++;
        }
        for(int i = 0; i < len; i++) {
            if(f[i] != num.charAt(i) -'0') return false;
        } return true;


    }
}