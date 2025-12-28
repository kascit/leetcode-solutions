/*
Submission: 1844797804
Status: Accepted
Timestamp: 2025-12-02 07:08:28 UTC
Runtime: 37 ms
Memory: 206.7 MB
*/

class Solution {
  static final int mod = (int) 1e9 + 7;
    public int countTrapezoids(int[][] points) {
        Map<Integer,Integer> lvlPoints = new HashMap<>();
        for (int[] p : points) lvlPoints.merge(p[1],1,Integer::sum);

        long ans = 0, sum = 0;
        for (int pointsAt : lvlPoints.values()) {
          long nC2 = pointsAt*(pointsAt-1L)/2L;
          ans += nC2*sum;
          sum += nC2;
        }

        return (int) (ans % mod);
    }
}