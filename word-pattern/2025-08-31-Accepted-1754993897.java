/*
 * Submission: 1754993897
 * Problem: Word Pattern (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:51:27 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Set<String> taken = new HashSet<>();
        String[] words = s.split(" ");
        int idx = 0;
        if (pattern.length() != words.length) return false;
        for (String w : words) {
            // if (w.equals("")) continue;
            char p = pattern.charAt(idx);
            if (map.containsKey(p)){
                if (!map.get(p).equals(w)) return false;
            } else {
                if(!taken.add(w)) return false;
                map.put(p,w);
            }
            idx++;
        }
        return true;
    }
}