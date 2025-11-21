/*
 * Submission: 1716628406
 * Problem: Truncate Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:08:11 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < arr.length && k-->0){
            ans.append(arr[i++]);
            if (k >= 1) ans.append(" ");
        }
        return ans.toString();
    }
}