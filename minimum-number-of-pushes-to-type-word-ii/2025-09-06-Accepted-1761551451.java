/*
 * Submission: 1761551451
 * Problem: Minimum Number of Pushes to Type Word II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:21:16 UTC
 * Runtime: 8 ms
 * Memory: 46.1 MB
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
    // System.out.println(Arrays.toString(freq));

    int ans = 0;
    for (int i : freq){
        if (i == 0) break;
        ans += t*i;
        count++;
        if (count%8==0) {
            t++;
        }
    }
    return ans;

    }
}