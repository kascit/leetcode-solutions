/*
 * Submission: 1761565866
 * Problem: Pascal's Triangle II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:36:56 UTC
 * Runtime: 1 ms
 * Memory: 41.5 MB
 */

class Solution {
    List<Integer> ans;
    public List<Integer> getRow(int rowIndex) {
        ans = new ArrayList<>();
        ans.add(1);
        if (rowIndex == 0) return ans;
        ans.add(1);
        if (rowIndex == 1) return ans;
        dost(rowIndex-1);
        return ans;
    }

    private void dost(int it) {
        if (it == 0) return;
        int size = ans.size();
        for (int i = 0; i < size - 1; i++) {
            ans.set(i,ans.get(i)+ans.get(i+1));
        }
        ans.remove(size-1);
        ans.add(1);
        ans.add(0,1);
        dost(it-1);
    }
}