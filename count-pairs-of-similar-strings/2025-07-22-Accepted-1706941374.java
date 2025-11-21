/*
 * Submission: 1706941374
 * Problem: Count Pairs Of Similar Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 07:59:20 UTC
 * Runtime: 127 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int similarPairs(String[] words) {
        int len = words.length, count = 0;
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                if (buddy(words[i],words[j])) {count++;System.out.println(i+""+j);}
            }
        }
        return count;
    }
    public boolean buddy(String a, String b){
        int as = 0, bs = 0;
        for (char ch : a.toCharArray()){
            as |= 1 << (ch - 'a');
        }
        for (char ch : b.toCharArray()){
            bs |= 1 << (ch - 'a');
        }
        return (as ^ bs) == 0;
    }
}