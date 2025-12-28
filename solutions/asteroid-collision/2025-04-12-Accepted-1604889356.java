/*
 * Submission: 1604889356
 * Problem: Asteroid Collision (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 18:47:55 UTC
 * Runtime: 5 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.addLast(a);
            } else {
                while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < -a) {
                    stack.removeLast();
                }

                if (stack.isEmpty() || stack.peekLast() < 0)  {
                    stack.addLast(a);
                }

                if (stack.peekLast() == -a) {
                    stack.removeLast();
                }
            }
        }


        return stack.stream().mapToInt(Integer::intValue).toArray();   
    }
}