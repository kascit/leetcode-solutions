/*
 * Submission: 1835218765
 * Problem: Set Intersection Size At Least Two (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-20 14:51:47 UTC
 * Runtime: 9 ms
 * Memory: 47.4 MB
 */

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int ans = 0, first = -1, last = -1;

        for(int[] i : intervals) {
            int cnt = ((first >= i[0]) ? 1 : 0);
            cnt += (last >= i[0]) ? 1 : 0;
            if (cnt ==  2) continue;
            if (cnt == 1) {
                ans++;
                last = first;
                first = i[1];
            } else {
                ans+=2;
                first = i[1];
                last = first - 1;
            }
        } return ans;
    }
}