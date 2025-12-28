/*
 * Submission: 1745110633
 * Problem: Minimum Number of Pushes to Type Word II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-23 07:17:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch-'a']++;
        }
        int count = 0;
        int t = 1;
        Arrays.sort(freq);
    for (int i = 0; i < freq.length / 2; i++) {
        int temp = freq[i];
        freq[i] = freq[freq.length - 1 - i];
        freq[freq.length - 1 - i] = temp;
    }

    int ans = 0;
    for (int i : freq){
        if (i == 0) continue;
        ans += t*i;
        count++;
        if (count == 8) {
            t++;
        }
    }
    return ans;

    }
}