/*
 * Submission: 1705702508
 * Problem: Minimum Number of Operations to Move All Balls to Each Box (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 08:52:20 UTC
 * Runtime: 324 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int[] minOperations(String boxes) {
        Set<Integer> indices = new HashSet<>();
        int lens = boxes.length();
        for (int i = 0; i < lens; i++){
            if (boxes.charAt(i) == '1'){
                indices.add(i);
            }
        }

        int[] res = new int[lens];
        for (int i = 0; i < lens; i++){
            int ans = 0;
            for ( Integer x : indices ){
                ans += Math.abs(x - i);
            }
            res[i] = ans;
        }

        return res;
    }
}