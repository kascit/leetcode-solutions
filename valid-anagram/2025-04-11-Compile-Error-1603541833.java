/*
 * Submission: 1603541833
 * Problem: Valid Anagram (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-11 10:09:50 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (str1.length() != str2.length())
      return false;
 
    int[] freq = new int[26];
    for (int i = 0; i < str1.length(); i++) {
      freq[str1.charAt(i) - 'a']++;
      freq[str2.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (freq[i] != 0)
        return false;
    }
    return true;
    }
}