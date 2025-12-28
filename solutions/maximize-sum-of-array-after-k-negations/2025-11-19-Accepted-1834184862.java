/*
 * Submission: 1834184862
 * Problem: Maximize Sum Of Array After K Negations (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 12:05:26 UTC
 * Runtime: 8 ms
 * Memory: 44.2 MB
 */

// gpt code just for reference
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // max-heap storing negated values => gives smallest original number when polled
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) pq.offer(-n);

        while (k-- > 0) {
            int topNeg = pq.poll();   // topNeg = - (smallest original)
            int smallest = -topNeg;   // smallest original value
            int flipped = -smallest;  // flipped value
            pq.offer(-flipped);       // store negated again

            // optimization: if smallest == 0, further flips do nothing
            if (smallest == 0) break;
        }

        int sum = 0;
        while (!pq.isEmpty()) sum += -pq.poll();
        return sum;
    }
}
