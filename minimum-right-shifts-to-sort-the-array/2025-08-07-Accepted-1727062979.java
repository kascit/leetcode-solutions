/*
 * Submission: 1727062979
 * Problem: Minimum Right Shifts to Sort the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 16:21:34 UTC
 * Runtime: 7 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int minimumRightShifts(List<Integer> list) {
        int len = list.size();
        if (IntStream.range(0, len)
                .map(i -> list.get(i) <= list.get((i + 1) % list.size()) ? 0 : 1)
                .sum() <= 1) {
                    int it = IntStream.range(0, len)
            .reduce((i, j) -> list.get(i) <= list.get(j) ? i : j)
            .orElse(-1);
            return (it == 0) ? 0 : len-it;

                }
                return -1;
        
    }
}