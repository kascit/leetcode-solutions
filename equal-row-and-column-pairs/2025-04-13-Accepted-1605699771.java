/*
 * Submission: 1605699771
 * Problem: Equal Row and Column Pairs (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:46:02 UTC
 * Runtime: 6 ms
 * Memory: 54.8 MB
 */

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> freqMap = new HashMap<>();
        char[] chars = new char[n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                chars[col] = (char) (grid[row][col] + '0');
            }
            String s = new String(chars);
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                chars[row] = (char) (grid[row][col] + '0');
            }

            String s = new String(chars);
            if (freqMap.containsKey(s))
                count += freqMap.get(s);
        }

        return count;
    }
}