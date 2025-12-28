/*
Submission: 1864784299
Status: Accepted
Timestamp: 2025-12-25 07:41:21 UTC
Runtime: 210 ms
Memory: 114.6 MB
*/

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
      for (int h : happiness) {
        pq.offer(h);
        if (pq.size() > k) pq.poll();
      }

      // long sub = k - 1;
      // sub = (sub * (sub + 1)) / 2;
      // for (var a : pq) ans += a;
      long ans = 0;
      int[] a = new int[pq.size()];
      int ptr = a.length;
      while(!pq.isEmpty()) {
        a[--ptr] = pq.poll();
      }
      long sub = 0;
      for(var x : a) {
        if (x < sub) {
          break;
        }
        ans += x - sub;
        sub++;
      }
      return ans;
    }
}