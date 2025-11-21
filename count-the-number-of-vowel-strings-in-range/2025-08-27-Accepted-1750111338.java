/*
 * Submission: 1750111338
 * Problem: Count the Number of Vowel Strings in Range (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 11:59:54 UTC
 * Runtime: 2 ms
 * Memory: 44.3 MB
 */

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        int len = words.length;
        for (int i = left; i <= right; i++) {
            if (wow(words[i])) ans++;
        } return ans;
    }
    private boolean wow(String s) {
        return "aeiouAEIOU".contains(Character.toString(s.charAt(0))) && "aeiouAEIOU".contains(Character.toString(s.charAt(s.length()-1)));
    }
}