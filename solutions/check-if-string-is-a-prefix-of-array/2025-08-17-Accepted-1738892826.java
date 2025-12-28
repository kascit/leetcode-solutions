/*
 * Submission: 1738892826
 * Problem: Check If String Is a Prefix of Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:50:20 UTC
 * Runtime: 1 ms
 * Memory: 42.5 MB
 */

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (String word : words){
            sb.append(word);
            if (sb.length() == len && sb.toString().indexOf(s) == 0){
                return true;
            }
        }
        return false;
    }
}