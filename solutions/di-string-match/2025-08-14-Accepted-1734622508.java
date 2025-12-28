/*
 * Submission: 1734622508
 * Problem: DI String Match (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 06:47:53 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] diStringMatch(String s) {
        int i = 0;
        int j = s.length(), idx = 0, cur = 0;
        int[] ans = new int[j+1];
        for(char c : s.toCharArray()){
            if (c == 'I') cur = i++;
            else cur = j--;
            ans[idx++] = cur;
        }
        ans[idx] = i;
        return ans;
    }
}