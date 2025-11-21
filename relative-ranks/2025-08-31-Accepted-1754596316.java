/*
 * Submission: 1754596316
 * Problem: Relative Ranks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 09:46:47 UTC
 * Runtime: 7 ms
 * Memory: 46 MB
 */

class Solution {
    public String[] findRelativeRanks(int[] s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int len = s.length;
        for (int i = 0; i < len; i++) {
            pq.offer(new Pair(s[i],i));
        }
        int i = 1;
        String[] ans = new String[len];
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            if (i > 3) {
                ans[p.second] = String.valueOf(i);
            } else {
                if (i == 1) ans[p.second] = "Gold Medal";
                else if (i == 2) ans[p.second] = "Silver Medal";
                else if (i == 3) ans[p.second] = "Bronze Medal";
            }
            i++;
        } return ans;
    }
}
class Pair implements Comparable<Pair>{
    public int first;
    public int second;
    Pair(int first, int second) { this.first = first; this.second = second; }

    @Override
    public int compareTo(Pair p) {
        return Integer.compare(p.first, this.first);
    }

}