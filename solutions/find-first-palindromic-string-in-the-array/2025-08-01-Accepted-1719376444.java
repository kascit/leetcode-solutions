/*
 * Submission: 1719376444
 * Problem: Find First Palindromic String in the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 10:15:33 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if (isPalin(word)) return word;
        }
        return "";
    }

    boolean isPalin(String word){
        int i = 0, j = word.length() - 1;
        while (i < j){
            if (word.charAt(i++) != word.charAt(j--)) return false;
        }
        return true;
    }
}