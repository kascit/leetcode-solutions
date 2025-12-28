/*
 * Submission: 1724584959
 * Problem: Decode the Message (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:57:31 UTC
 * Runtime: 7 ms
 * Memory: 43.6 MB
 */

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> kode = new HashMap<>();
        char cur = 'a';
        for (char c : key.toCharArray()){
            //System.out.println(c +"   " + cur);
            if (!Character.isLetter(c) || kode.containsKey(c)) continue;
            kode.put(c,cur);
            cur++;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : message.toCharArray()){
            if (!Character.isLetter(c)) ans.append(c);
            else ans.append(kode.get(c));
        } return ans.toString();
    }
}