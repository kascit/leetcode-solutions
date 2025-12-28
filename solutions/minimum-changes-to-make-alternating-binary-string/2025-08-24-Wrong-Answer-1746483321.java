/*
 * Submission: 1746483321
 * Problem: Minimum Changes To Make Alternating Binary String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 10:29:10 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(String s) {
        int a = 0, b = 0, len = s.length(), aa = 0, bb = 0;
        char prev = s.charAt(0);
        boolean diff = false;
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (!diff && i > 0) {
                if (cur != prev) {
                    diff = true;
                }
            }
            if (i%2 == 0) {
                if (cur == '0') {
                    a++;
                } else aa++;
                // System.out.println("even" + a);
            }
            else {
                if (cur == '0') {
                    b++;
                } else bb++;
                // System.out.println("odd" + b);
            }
            prev = cur;
        } 
        // int ans = aa - a;
        // if (ans < 0) ans *= -1;
        if (!diff) return len/2;
        // System.out.println(aa+"   "+a+"   "+bb+"   "+b);
        return Math.min(aa,a) + Math.min(bb,b);
    }
}
/*
1 1 0 0 0 1 0 1 1 1
1   0   0   0   1
  1   0   1   1   1

*/