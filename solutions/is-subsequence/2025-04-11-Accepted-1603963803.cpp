/*
 * Submission: 1603963803
 * Problem: Is Subsequence (Easy)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-04-11 19:26:17 UTC
 * Runtime: 0 ms
 * Memory: 8.7 MB
 */

class Solution {
public:
    bool isSubsequence(string s, string t) {
        
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s[i]==t[j]) i++;
            j++;
        }
        if(i==s.length()) return true;
        return false;
    }
};