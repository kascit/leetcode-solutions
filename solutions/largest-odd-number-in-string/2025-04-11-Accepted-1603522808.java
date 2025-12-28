/*
 * Submission: 1603522808
 * Problem: Largest Odd Number in String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 09:42:29 UTC
 * Runtime: 1 ms
 * Memory: 45.3 MB
 */

class Solution {
    public String largestOddNumber(String num) {
        //if((int)num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}