/*
 * Submission: 1604769407
 * Problem: Asteroid Collision (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 16:31:21 UTC
 * Runtime: 5 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.offerLast(a);
            } else {
                while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < -a) {
                    stack.pollLast();
                }

                if (stack.isEmpty() || stack.peekLast() < 0)  {
                    stack.offerLast(a);
                }

                if (stack.peekLast() == -a) {
                    stack.pollLast();
                }
            }
        }


        return stack.stream().mapToInt(Integer::intValue).toArray();   
    }
}