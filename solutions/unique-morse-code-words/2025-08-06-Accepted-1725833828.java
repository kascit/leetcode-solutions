/*
 * Submission: 1725833828
 * Problem: Unique Morse Code Words (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 15:41:41 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int len = words.length;
        if ( len < 2 ) return len;
        Set<String> check = new HashSet<>();
        for(int i = 0; i < len; i++){
            check.add(morseWa(words[i]));
        }
        return check.size();
    }

    private String morseWa(String s){
        String[] aToDots = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            sb.append(aToDots[c-'a']);
        } return sb.toString();
    }
}