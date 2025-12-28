/*
 * Submission: 1604695995
 * Problem: Asteroid Collision (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 15:28:38 UTC
 * Runtime: 8 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
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