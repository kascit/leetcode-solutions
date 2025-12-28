/*
 * Submission: 1735104466
 * Problem: Decrypt String from Alphabet to Integer Mapping (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 15:49:59 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String freqAlphabets(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++){
            if (i+2 > len - 1 || (arr[i+1] != '#' && arr[i+2] != '#' && arr[i] != '#' )){
                sb.append((char)(arr[i]-'1'+'a'));
            } 
            else if(arr[i] !='#' && arr[i+1] !='#'){
                int tens = arr[i] - '0';
                int ones = arr[i+1] - '0';
                sb.append((char)('a' + 10*tens + ones - 1));
                i+=2;
            }
        }
        return sb.toString();
    }
}