/*
 * Submission: 1762409575
 * Problem: Maximum Length Substring With Two Occurrences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:52:41 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    int[] freq = new int[26];
    public int maximumLengthSubstring(String s) {
        int len = s.length();
        int l = 0, r = 0, ans = 0;
        while (l < len && r <= len) {
            if (!cus()) {
                dus(s.charAt(l),-1);
                l++;
                continue;
            }
            // System.out.println(Arrays.toString(freq));
            // System.out.println(l+"   "+r);
            ans = Math.max(ans,r-l);
            if (r < len)dus(s.charAt(r),1);
            r++;

        } return ans;
    }

    private void dus(char ch, int i) {
        freq[ch-'a']+=i;
    }

    private boolean cus() {
        for (int f : freq) {
            if (f > 2) return false;
        } return true;
    }
}