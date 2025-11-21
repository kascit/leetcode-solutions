/*
 * Submission: 1604699569
 * Problem: Asteroid Collision (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 15:30:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                deque.offerFirst(a);  // Right-moving asteroids just go into the deque
            } else {
                // Handle left-moving asteroids (negative values)
                while (!deque.isEmpty() && deque.peekFirst() > 0) {
                    int top = deque.peekFirst();  // The asteroid moving right
                    
                    if (top < -a) {
                        // The right asteroid is smaller, it gets destroyed
                        deque.pollFirst();  // Remove the right-moving asteroid
                    } else if (top == -a) {
                        // Both asteroids are of the same size, both get destroyed
                        deque.pollFirst();  // Remove the right-moving asteroid
                        break;  // Both asteroids are destroyed, no further action needed
                    } else {
                        // The left asteroid is smaller, it gets destroyed
                        break;
                    }
                }

                // If the left asteroid wasn't destroyed, push it to the deque
                if (deque.isEmpty() || deque.peekFirst() < 0) {
                    deque.offerFirst(a);
                }
            }
        }

        // Convert deque to an int array
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
