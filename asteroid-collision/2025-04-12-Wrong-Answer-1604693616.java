/*
 * Submission: 1604693616
 * Problem: Asteroid Collision (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-12 15:27:08 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        for(int num : a){
            if (num < 0){
                if(s.isEmpty()) s.push(num);
                else if (s.peek() == -num) s.pop();
                else if (s.peek() < -num) {while(!s.isEmpty() && s.peek() < -num)s.pop(); if(s.isEmpty())s.push(num);}
            } else s.push(num);
        }
        return s.stream().mapToInt(Integer::intValue).toArray();
    }
}