/*
 * Submission: 1754993017
 * Problem: Word Pattern (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-31 16:50:39 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Set<String> taken = new HashSet<>();
        String[] words = s.split(" ");
        int idx = 0;
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