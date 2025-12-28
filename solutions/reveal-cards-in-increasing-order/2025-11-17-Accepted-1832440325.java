/*
 * Submission: 1832440325
 * Problem: Reveal Cards In Increasing Order (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 15:42:33 UTC
 * Runtime: 8 ms
 * Memory: 45.9 MB
 */

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q = new LinkedList<>();
        // 2 3 5 7 11 13 17
        int len = deck.length;
        for (int i = len - 1; i >= 0; i--) {
            if (!q.isEmpty()) q.addFirst(q.removeLast());
            q.addFirst(deck[i]);
        } 
        int[] a = new int[q.size()];
        int i = 0;
        for (int x : q) {
            a[i++] = x;
        } return a;
    }
}