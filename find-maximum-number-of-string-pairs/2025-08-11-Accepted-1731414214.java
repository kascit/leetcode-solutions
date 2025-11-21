/*
 * Submission: 1731414214
 * Problem: Find Maximum Number of String Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 15:52:15 UTC
 * Runtime: 3 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt = 0;
        Set<String> check = new HashSet<>();
        for (String w : words){
            if(check.contains(w)){
                cnt++;
                check.remove(w);
            } else {
                check.add(reverse(w));
            }
        } return cnt;
    }
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

}