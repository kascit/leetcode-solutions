/*
 * Submission: 1738840072
 * Problem: Distribute Candies (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:02:17 UTC
 * Runtime: 31 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int i : candyType){
            types.add(i);
        }

        return Math.min(candyType.length/2,types.size());
    }
}