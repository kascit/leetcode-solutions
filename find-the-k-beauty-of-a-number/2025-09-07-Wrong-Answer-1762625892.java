/*
 * Submission: 1762625892
 * Problem: Find the K-Beauty of a Number (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 12:13:45 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        int tramananala = 1, ans = 0;
        StringBuilder sb = new StringBuilder();
        while (tramananala*10 <= num) {
            tramananala *= 10;
        }
        for (int i = 0; i < k; i++) {
            int cur = num/tramananala;
            num%=tramananala;
            tramananala/=10;
            sb.append(cur);
        }
        int div = Integer.parseInt(sb.toString());
        if (div != 0 && num%div == 0) ans++;
        while (tramananala > 0) {
            sb.deleteCharAt(0);
            int cur = num/tramananala;
            num%=tramananala;
            tramananala/=10;
            sb.append(cur);
            div = Integer.parseInt(sb.toString());
            if (div != 0 && num%div == 0) ans++;
        }
        // System.out.println(sb+"  "+num);
        return ans;
    }
}