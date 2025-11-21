/*
 * Submission: 1735794508
 * Problem: Faulty Keyboard (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 07:20:41 UTC
 * Runtime: 3 ms
 * Memory: 44.9 MB
 */

class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if (ch == 'i') sb.reverse();
            else sb.append(ch);
        } return sb.toString();
    }
}