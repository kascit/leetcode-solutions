/*
 * Submission: 1603962951
 * Problem: Is Subsequence (Easy)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-04-11 19:25:05 UTC
 * Runtime: 0 ms
 * Memory: 8.7 MB
 */

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int m=s.length(),n=t.length();
        int i=0,j=0;
        while(i<m && j<n){
            if(s[i]==t[j]) i++,j++;
            else j++;
        }
        if(i==m) return true;
        return false;
    }
};