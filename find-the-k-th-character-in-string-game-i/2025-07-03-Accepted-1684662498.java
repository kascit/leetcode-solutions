/*
 * Submission: 1684662498
 * Problem: Find the K-th Character in String Game I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-03 06:09:41 UTC
 * Runtime: 16 ms
 * Memory: 45.4 MB
 */

class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k){
            String newr = "";
            for(int i = 0; i < word.length(); i++){
                newr += (char)(word.charAt(i) + 1);
            }   
            word += newr;
        }
        return word.charAt(k-1);
    }
}