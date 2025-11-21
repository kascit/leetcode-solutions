/*
 * Submission: 1738841088
 * Problem: Distribute Candies (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:03:09 UTC
 * Runtime: 27 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>(candyType.length/2);
        for (int i : candyType){
            types.add(i);
        }

        return Math.min(candyType.length/2,types.size());
    }
}