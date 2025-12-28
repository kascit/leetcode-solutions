/*
 * Submission: 1602523009
 * Problem: Merge Strings Alternately (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:19:49 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        char[] a = word1.toCharArray(), b = word2.toCharArray();
        while ( i < a.length || i < b.length ){
            if (i < a.length){
                ans.append(a[i]);
            }
            if (i < b.length){
                ans.append(b[i]);
            }
            i++;
        }
        return ans.toString();
    }
}