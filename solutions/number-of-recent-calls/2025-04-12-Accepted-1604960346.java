/*
 * Submission: 1604960346
 * Problem: Number of Recent Calls (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 20:29:45 UTC
 * Runtime: 22 ms
 * Memory: 54.7 MB
 */

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int time) {
        queue.add(time);
        while (queue.peek() < time - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}