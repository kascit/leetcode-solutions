/*
 * Submission: 1746195101
 * Problem: Find Resultant Array After Removing Anagrams (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 05:17:05 UTC
 * Runtime: 10 ms
 * Memory: 45.8 MB
 */

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        // Set<String> set = new HashSet<>();
        String prev = "";
        for (String word : words) {
            int[] freq = new int[26];
            int len = word.length();
            for (int i = 0; i < len; i++) {
                freq[word.charAt(i)-'a']++;
            }
            String cur = Arrays.toString(freq);
            if (!cur.equals(prev)) {
                // set.add(s);
                ans.add(word);
                prev = cur;
            }
        } return ans;
    }
    // public static String sortString(String s) {
    //     char[] arr = s.toCharArray();  
    //     Arrays.sort(arr);              
    //     return new String(arr);        
    // }
}