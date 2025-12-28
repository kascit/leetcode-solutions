/*
 * Submission: 1754991618
 * Problem: Word Pattern (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-31 16:49:30 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] words = s.split(" ");
        int idx = 0;
        for (String w : words) {
            // if (w.equals("")) continue;
            char p = pattern.charAt(idx);
            if (map.containsKey(p)){
                if (!map.get(p).equals(w)) return false;
            } else {
                map.put(p,w);
            }
            idx++;
        }
        return true;
    }
}