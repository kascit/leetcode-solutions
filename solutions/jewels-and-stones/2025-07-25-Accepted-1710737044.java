/*
 * Submission: 1710737044
 * Problem: Jewels and Stones (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 08:41:22 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> check = new HashSet<>();
        for (var j : jewels.toCharArray()){
            check.add(j);
        }
        for (var sj : stones.toCharArray()){
            count += (check.contains(sj)) ? 1 : 0;
        }
        return count;

    }
}