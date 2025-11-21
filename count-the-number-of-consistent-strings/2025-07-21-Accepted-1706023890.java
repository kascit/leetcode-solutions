/*
 * Submission: 1706023890
 * Problem: Count the Number of Consistent Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 14:12:11 UTC
 * Runtime: 15 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for (String word : words){
            boolean flag = true;
            for (int i=0; i<word.length(); i++){
                if (allowed.indexOf(word.charAt(i)) == -1) {flag = false;break;}
            }
            if (flag) cnt++;
        }
        return cnt;
    }
}