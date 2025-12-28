/*
 * Submission: 1725832263
 * Problem: Unique Morse Code Words (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 15:40:23 UTC
 * Runtime: 2 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int len = words.length, count = 0;
        if ( len < 2 ) return len;
        Set<String> check = new HashSet<>();
        for(int i = 0; i < len; i++){
            String cur = morseWa(words[i]);
            if (!check.contains(cur)){
                count++;
            }
            check.add(cur);
        }
        return count;
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