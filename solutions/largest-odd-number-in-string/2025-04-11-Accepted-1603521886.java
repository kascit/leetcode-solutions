/*
 * Submission: 1603521886
 * Problem: Largest Odd Number in String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 09:41:07 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}