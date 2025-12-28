/*
 * Submission: 1730250000
 * Problem: Check if a String Is an Acronym of Words (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-08-10 15:14:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        char[] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=words.get(i).charAt(0);
        }
        String str=new String(ch);
        return str.equals(s);
}
    }
}