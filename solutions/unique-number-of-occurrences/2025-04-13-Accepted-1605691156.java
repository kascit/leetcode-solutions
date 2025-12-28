/*
 * Submission: 1605691156
 * Problem: Unique Number of Occurrences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:35:27 UTC
 * Runtime: 2 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
