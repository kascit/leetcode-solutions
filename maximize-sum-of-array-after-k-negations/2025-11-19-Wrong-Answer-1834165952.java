/*
 * Submission: 1834165952
 * Problem: Maximize Sum Of Array After K Negations (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 11:36:45 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        boolean zero = false;
        int cnt = 0;
        for (int n : nums) {
            if (n == 0) zero = true;
            else if (n < 0) cnt++;
            sum += n;
            pq.offer(n);
            if (pq.size()>k) pq.poll();
        }
        int tcnt = cnt;
        boolean odd = ((k-cnt)&1) == 1, done = false;
        while (!pq.isEmpty()) {
            int p = pq.poll();

            if (zero) {
                if (p < 0) {
                    sum -= 2*p; 
                }
            }
            else if (cnt == 0 || cnt > k) {
                if (p < 0)
                sum -= 2*p; 
                if (pq.size() == 0) {
                    if (k%2==1) sum -= 2*p;
                }
            }
            else {
                if(p < 0) {
                    // System.out.println(p);
                    if (done) {
                        // System.out.println("done");
                        sum -= 2*p; 
                    } else {
                        // System.out.println("not done");
                        if (!odd) sum -= 2*p;
                        done = true;
                    }
                }
            }
        } return sum;
    }
}