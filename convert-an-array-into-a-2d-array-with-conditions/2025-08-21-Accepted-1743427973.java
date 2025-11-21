/*
 * Submission: 1743427973
 * Problem: Convert an Array Into a 2D Array With Conditions (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:31:20 UTC
 * Runtime: 2 ms
 * Memory: 44.9 MB
 */

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> findMatrix(int[] nums) {
        int len = nums.length;
        int[] freq = new int[len+1];
        ans = new ArrayList<>(len);
        for(int n : nums) {
            freq[n]++;
        }
        List<Integer> cur = new ArrayList<>();
        while(len>0) {
            for (int i = 1; i < nums.length+1; i++) {
                if (freq[i] == 0) continue;
                cur.add(i);
                freq[i]--;
                len--;
            }
            ans.add(new ArrayList(cur));
            cur.clear();
        }
        return ans;
    }
}