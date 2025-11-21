/*
 * Submission: 1607751693
 * Problem: Group Anagrams (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-15 16:57:50 UTC
 * Runtime: 18 ms
 * Memory: 49.8 MB
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key,new ArrayList<String>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
