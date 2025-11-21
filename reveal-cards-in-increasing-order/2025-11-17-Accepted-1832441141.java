/*
 * Submission: 1832441141
 * Problem: Reveal Cards In Increasing Order (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 15:43:27 UTC
 * Runtime: 7 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q = new ArrayDeque<>();
        // 2 3 5 7 11 13 17
        int len = deck.length;
        for (int i = len - 1; i >= 0; i--) {
            if (!q.isEmpty()) q.offerFirst(q.pollLast());
            q.offerFirst(deck[i]);
        } 
        int[] a = new int[q.size()];
        int i = 0;
        for (int x : q) {
            a[i++] = x;
        } return a;
    }
}