/*
 * Submission: 1599157114
 * Problem: Roman to Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-07 04:29:46 UTC
 * Runtime: 2 ms
 * Memory: 44.8 MB
 */

class Solution {
     public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}