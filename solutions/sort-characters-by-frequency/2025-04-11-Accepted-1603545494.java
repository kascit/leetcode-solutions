/*
 * Submission: 1603545494
 * Problem: Sort Characters By Frequency (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:15:05 UTC
 * Runtime: 12 ms
 * Memory: 45.4 MB
 */


class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        TreeMap<Integer, List<Character>> r = new TreeMap<>(Collections.reverseOrder());
        StringBuilder ss = new StringBuilder();

        for (char a : s.toCharArray())
            mp.put(a, mp.getOrDefault(a, 0) + 1);

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (!r.containsKey(entry.getValue())) {
                r.put(entry.getValue(), new ArrayList<>());
            }
            r.get(entry.getValue()).add(entry.getKey());
        }

        for (Map.Entry<Integer, List<Character>> entry : r.entrySet()) {
            int freq = entry.getKey();
            List<Character> chars = entry.getValue();
            for (char c : chars) {
                for (int i = 0; i < freq; i++) {
                    ss.append(c);
                }
            }
        }

        return ss.toString();
    }
}


