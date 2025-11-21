/*
 * Submission: 1725742168
 * Problem: Reverse Words in a String III (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 14:20:21 UTC
 * Runtime: 6 ms
 * Memory: 45.6 MB
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for(String word : words){
            sb.append(rev.append(word).reverse() + " ");
            rev.setLength(0);
        } sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}