/*
 * Submission: 1753772380
 * Problem: Minimum Amount of Time to Fill Cups (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 16:12:29 UTC
 * Runtime: 2 ms
 * Memory: 41.7 MB
 */

class Solution {
    public int fillCups(int[] am) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : am){
            pq.offer(a);
        }
        int ans = 0;
        while(pq.peek() != 0){
            int cur = pq.poll()-1;
            int ruc = pq.poll()-1;
            pq.offer(cur);
            pq.offer(ruc);
            ans++;
        } return ans;
    }
}


























        // if (am[0] > am[1]){
        //     am[1] = am[0]^am[1];
        //     am[0] = am[0]^am[1];
        //     am[1] = am[0]^am[1];
        // }
        // if (am[1] > am[2]) {
        //     am[2] = am[2]^am[1];
        //     am[1] = am[2]^am[1];
        //     am[2] = am[2]^am[1];
        // }
        // if (am[0] > am[1]){
        //     am[1] = am[0]^am[1];
        //     am[0] = am[0]^am[1];
        //     am[1] = am[0]^am[1];
        // }
        // System.out.println(Arrays.toString(am));
        // int ans = 0;
        // ans += am[0];
        // am[2]-=am[0];
        // int min = (am[2] < am[1]) ? am[2] : am[1];
        // ans += am[2] + am[1] - min;
        // return ans;