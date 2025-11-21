/*
 * Submission: 1764638988
 * Problem: Check if The Number is Fascinating (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-09 06:51:41 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isFascinating(int n) {
        int t = n;
        while (t > n) {
            int cur = t%10;
            if (cur == 0 || cur == 5) return false;
            t /= 10;
        }
        int n2 = 2*n;
        int n3 = 3*n;
        int[] freq = new int[10];
        String c = String.valueOf(n)+String.valueOf(n2)+String.valueOf(n3);
        for(char ch : c.toCharArray()) {
            if (freq[ch-'0'] == 1) return false;
            freq[ch-'0'] = 1;
        } return true;
    }
}