/*
 * Submission: 1762627223
 * Problem: Find the K-Beauty of a Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 12:15:24 UTC
 * Runtime: 1 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        int tramananala = 1, ans = 0, temp = num;
        StringBuilder sb = new StringBuilder();
        while (tramananala*10 <= temp) {
            tramananala *= 10;
        }
        for (int i = 0; i < k; i++) {
            int cur = temp/tramananala;
            temp%=tramananala;
            tramananala/=10;
            sb.append(cur);
        }
        int div = Integer.parseInt(sb.toString());
        if (div != 0 && num%div == 0) ans++;
        while (tramananala > 0) {
            sb.deleteCharAt(0);
            int cur = temp/tramananala;
            temp%=tramananala;
            tramananala/=10;
            sb.append(cur);
            div = Integer.parseInt(sb.toString());
            if (div != 0 && num%div == 0) ans++;
        // System.out.println(div+"  "+temp);
        }
        return ans;
    }
}