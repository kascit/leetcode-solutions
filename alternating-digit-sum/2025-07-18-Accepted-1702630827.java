/*
 * Submission: 1702630827
 * Problem: Alternating Digit Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 16:32:06 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        for(int i = 0 ; i < num.length();i++){
            char ch = num.charAt(i);
            if(i % 2 == 0){
                sum += ch - '0';
            }
            else{
                sum -= ch - '0';
            }
        }
        return sum;
    }
}