/*
 * Submission: 1746195616
 * Problem: Find Resultant Array After Removing Anagrams (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 05:17:40 UTC
 * Runtime: 10 ms
 * Memory: 45.4 MB
 */

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        // Set<String> set = new HashSet<>();
        String prev = "";
        for (String word : words) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch-'a']++;
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