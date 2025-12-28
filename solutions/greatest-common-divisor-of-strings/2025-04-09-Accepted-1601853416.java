/*
 * Submission: 1601853416
 * Problem: Greatest Common Divisor of Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-09 16:23:48 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
public String gcdOfStrings(String str1, String str2) {
        return ((str1 + str2).equals(str2 + str1))? 
        str1.substring(0, gcd(str1.length(),str2.length())): "";
    }
    private int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
};