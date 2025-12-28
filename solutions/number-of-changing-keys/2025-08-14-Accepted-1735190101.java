/*
 * Submission: 1735190101
 * Problem: Number of Changing Keys (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 17:08:08 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int countKeyChanges(String s) {
        int c = 0;
        int last = -1;
        for(char ch : s.toLowerCase().toCharArray()){
            if(last != -1 && last != ch){
                c++;
            } last = ch;
        }return c;
    } 
}