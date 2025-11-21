/*
 * Submission: 1755646154
 * Problem: Maximum Average Pass Ratio (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-01 09:12:40 UTC
 * Runtime: 594 ms
 * Memory: 90 MB
 */

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(
    (a, b) -> {
        double gainA = (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1];
        double gainB = (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1];
        return Double.compare(gainB, gainA); 
    }
);

for (int i = 0; i < classes.length; i++) {
    pq.add(new Integer[]{classes[i][0], classes[i][1]});
}
        
        double ans =0;
        while(extraStudents--> 0){
            Integer[] p = pq.poll();
            // System.out.println(Arrays.toString(p));
            p[0] +=1;
            p[1] +=1;
            // System.out.println(Arrays.toString(p));
            pq.add(p);
        }

        while(!pq.isEmpty()){
            Integer[] p = pq.poll();
            // System.out.println(Arrays.toString(p));
            ans += (double)p[0]/p[1];


        }
        return ans/classes.length;
    }
}