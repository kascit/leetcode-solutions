/*
 * Submission: 1730250579
 * Problem: Check if a String Is an Acronym of Words (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:14:43 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        if (n != s.length()) return false;
        char[] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=words.get(i).charAt(0);
        }
        String str=new String(ch);
        return str.equals(s);
    }
}