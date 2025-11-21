/*
 * Submission: 1701433877
 * Problem: Sort Vowels in a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 15:23:03 UTC
 * Runtime: 1350 ms
 * Memory: 48.2 MB
 */

class Solution {
    public String sortVowels(String s) {
        List<Character> vows = new ArrayList<>();
        int n = s.length();
        String vow = "AEIOUaeiou";
        for (int i = 0; i < n; i++){
            if (vow.indexOf(s.charAt(i)) != -1) vows.add(s.charAt(i));
        }
        Collections.sort(vows);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            if(vow.indexOf(s.charAt(i)) != -1) {
                sb.append(vows.remove(0));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}