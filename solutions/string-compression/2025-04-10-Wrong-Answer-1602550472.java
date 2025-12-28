/*
 * Submission: 1602550472
 * Problem: String Compression (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-10 09:58:16 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for (int i = 0; i < chars.length; i++ ){
            char cur = chars[i];
            int count = 0;
            while (i < chars.length && chars[i++] == cur){
                count++;
            } i--;
            chars[ans++] = cur;
            if (count > 1) {
                // convert count to string and iterate over each character in string
                for (final char c : String.valueOf(count).toCharArray()) {
                chars[ans++] = c;
                }
            }

        }
        return ans;
    }
}