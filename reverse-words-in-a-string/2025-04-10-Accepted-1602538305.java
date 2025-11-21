/*
 * Submission: 1602538305
 * Problem: Reverse Words in a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:41:38 UTC
 * Runtime: 8 ms
 * Memory: 43 MB
 */

class Solution {
    public String reverseWords(String s) {
        String chars[] = s.trim().split("\\s+");
        List<String> charList = Arrays.asList(chars);
      
        Collections.reverse(charList);
        return String.join(" ",charList);



        
    }
}