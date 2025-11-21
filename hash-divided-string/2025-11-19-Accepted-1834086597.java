/*
 * Submission: 1834086597
 * Problem: Hash Divided String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:40:03 UTC
 * Runtime: 2 ms
 * Memory: 46.3 MB
 */

class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int cur = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i!=0 && cur%k == 0) {
                sb.append((char)(sum%26+'a'));
            cur = 0;
            sum = 0;
                
                // System.out.println(s.charAt(i)+""+sum);
                // continue;
            }
            sum += s.charAt(i) - 'a';
                cur++;
            }
            // System.out.println(sum);
         return sb.append((char)(sum%26+'a')).toString();
    }
}