/*
 * Submission: 1603543378
 * Problem: Valid Anagram (Easy)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-04-11 10:12:01 UTC
 * Runtime: 0 ms
 * Memory: 9.7 MB
 */

#include <string>
#include <vector>
using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;
        
        vector<int> frequency(26, 0);
        
        for (int i = 0; i < s.length(); i++) {
           // xorSum ^= s[i] ^ t[i]; // XOR both characters
            frequency[s[i] - 'a']++; // Increment for s
            frequency[t[i] - 'a']--; // Decrement for t
        }
        
       // if (xorSum != 0) return false; // If XOR isn't zero, they're not anagrams
        
        for (int freq : frequency) {
            if (freq != 0) return false; // Check frequency counts
        }
        
        return true;
    }
};