/*
 * Submission: 1730269227
 * Problem: Clear Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:34:56 UTC
 * Runtime: 1 ms
 * Memory: 42.5 MB
 */

class Solution {
    public String clearDigits(String s) {
        StringBuilder str=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
                str.deleteCharAt(str.length()-1);
        }else{
            str.append(ch);
        }
       }return str.toString();
    }
}