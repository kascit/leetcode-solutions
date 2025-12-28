/*
Submission: 1839581033
Status: Accepted
Timestamp: 2025-11-25 16:50:38 UTC
Runtime: 51 ms
Memory: 51.6 MB
*/

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int[] frn = times[targetFriend];
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> availableQueue = new PriorityQueue<>();
        for (int i = 0; i < times.length; i++) {
            availableQueue.add(i);
        }

        PriorityQueue<int[]> leavingQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        for (int[] t : times) {
            int curA = t[0];
            int curD = t[1];
            while(!leavingQueue.isEmpty() && leavingQueue.peek()[0] <=curA){
                availableQueue.offer(leavingQueue.poll()[1]);
            }
            int chair = availableQueue.poll();
            if (Arrays.equals(frn,t)) return chair;
            leavingQueue.offer(new int[]{curD,chair});
        } return -1;
    }
}