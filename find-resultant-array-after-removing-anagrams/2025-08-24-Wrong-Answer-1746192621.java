/*
 * Submission: 1746192621
 * Problem: Find Resultant Array After Removing Anagrams (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 05:14:17 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String word : words) {
            int[] freq = new int[26];
            int len = word.length();
            for (int i = 0; i < len; i++) {
                freq[word.charAt(i)-'a']++;
            }
            String s = Arrays.toString(freq);
            if (!set.contains(s)) {
                set.add(s);
                ans.add(word);
            }
        } return ans;
    }
    // public static String sortString(String s) {
    //     char[] arr = s.toCharArray();  
    //     Arrays.sort(arr);              
    //     return new String(arr);        
    // }
}