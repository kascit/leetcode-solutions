/*
 * Submission: 1746476931
 * Problem: Minimum Changes To Make Alternating Binary String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 10:22:17 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(String s) {
        int a = 0, b = 0, len = s.length(), aa = 0, bb = 0, magic = 0;
        for (int i = 0; i < len; i++) {
            if (i%2 == 0) {
                if (s.charAt(i) == '0') {
                    a++; magic++;
                } else aa++;
                // System.out.println("even" + a);
            }
            else {
                if (s.charAt(i) == '0') {
                    b++; magic++;
                } else bb++;
                // System.out.println("odd" + b);
            }
        } 
        // int ans = aa - a;
        // if (ans < 0) ans *= -1;
        if (magic%2 == 0) return len/2;
        return Math.min(aa,a) + Math.min(bb,b);
    }
}