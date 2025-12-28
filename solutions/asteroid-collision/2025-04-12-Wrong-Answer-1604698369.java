/*
 * Submission: 1604698369
 * Problem: Asteroid Collision (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 15:30:07 UTC
 * Runtime: N/A
 * Memory: N/A
 */


class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                deque.offerFirst(a);  // Push to the front of the deque (equivalent to push in Stack)
            } else {
                // Handle collision
                while (!deque.isEmpty() && deque.peekFirst() > 0 && deque.peekFirst() < -a) {
                    deque.pollFirst();  // Pop from the front of the deque (equivalent to pop in Stack)
                }

                // Check if there's no collision or if the asteroid is destroyed
                if (deque.isEmpty() || deque.peekFirst() < 0) {
                    deque.offerFirst(a);  // Push the asteroid if no collision or if it's moving in the opposite direction
                }

                // If they are equal in size, they destroy each other
                if (!deque.isEmpty() && deque.peekFirst() == -a) {
                    deque.pollFirst();  // Both asteroids destroy each other
                }
            }
        }

        // Convert deque to an int array
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
