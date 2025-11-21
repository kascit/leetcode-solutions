/*
 * Submission: 1730308321
 * Problem: Number of Strings That Appear as Substrings in Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:14:26 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String pattern : patterns){
            if(word.indexOf(pattern) != -1) ans++;
        } return ans;
    }
}