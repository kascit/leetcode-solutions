/*
 * Submission: 1604700763
 * Problem: Asteroid Collision (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 15:31:39 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                deque.push(a);  // Push to the front of the deque (same as push in Stack)
            } else {
                // Handle the left-moving asteroid (negative value)
                while (!deque.isEmpty() && deque.peek() > 0 && deque.peek() < -a) {
                    deque.pop();  // Pop from the front of the deque (same as pop in Stack)
                }

                // If no collision or if the top of deque is a left-moving asteroid
                if (deque.isEmpty() || deque.peek() < 0) {
                    deque.push(a);  // Push the left asteroid to the deque
                }

                // If the top asteroid in deque is the same size, both are destroyed
                if (!deque.isEmpty() && deque.peek() == -a) {
                    deque.pop();  // Both asteroids destroy each other
                }
            }
        }

        // Convert deque to an int array
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
