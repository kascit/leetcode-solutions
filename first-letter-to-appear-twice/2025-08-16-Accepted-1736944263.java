/*
 * Submission: 1736944263
 * Problem: First Letter to Appear Twice (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:01:20 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        char [] ar = s.toCharArray();
        for (char ch : ar){
            if (set.contains(ch)) return ch;
            set.add(ch);
        } return '-';
    }
}