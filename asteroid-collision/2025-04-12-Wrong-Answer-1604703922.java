/*
 * Submission: 1604703922
 * Problem: Asteroid Collision (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 15:33:39 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }


        return stack.stream().mapToInt(Integer::intValue).toArray();   
    }
}