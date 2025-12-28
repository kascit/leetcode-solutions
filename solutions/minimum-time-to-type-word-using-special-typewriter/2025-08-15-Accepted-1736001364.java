/*
 * Submission: 1736001364
 * Problem: Minimum Time to Type Word Using Special Typewriter (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 10:58:58 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        int last = 'a';
        for(char ch : word.toCharArray()){
            int cur = ch - last;
            // System.out.println(cur);
            // System.out.println((int)ch);
            // System.out.println(last);
            if (cur < 0) cur *=-1;
            // System.out.println(cur);
            if(cur > 13) cur = 26 - cur;
            ans += cur;
            ans++;
            last = ch;
        } return ans;
    }
}