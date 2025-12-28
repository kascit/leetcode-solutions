/*
 * Submission: 1746626517
 * Problem: Split Strings by Separator (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 13:05:11 UTC
 * Runtime: 8 ms
 * Memory: 45.8 MB
 */

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        // System.out.println(Character.toString(separator));
        for (String word : words) {
            // System.out.println(word);
            String[] arr = word.split("\\"+Character.toString(separator));
            // System.out.println(Arrays.toString(arr));
            for (String s : arr) {
                if (!s.isEmpty()) {
                    ans.add(s);
                }
            }
        } return ans;
    }
}