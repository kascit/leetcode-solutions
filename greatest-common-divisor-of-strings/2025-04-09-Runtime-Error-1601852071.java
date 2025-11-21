/*
 * Submission: 1601852071
 * Problem: Greatest Common Divisor of Strings (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-09 16:22:31 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
public String gcdOfStrings(String str1, String str2) {
        return ((str1 + str2).equals(str2 + str1))? 
        str1.substring(0, gcd(str1.length(),str2.length())): "";
    }
    private int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b,a%b);
    }
};