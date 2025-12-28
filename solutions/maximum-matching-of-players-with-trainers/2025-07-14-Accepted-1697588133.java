/*
 * Submission: 1697588133
 * Problem: Maximum Matching of Players With Trainers (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-14 14:11:57 UTC
 * Runtime: 26 ms
 * Memory: 65.8 MB
 */

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        int j = 0;
        while(i < players.length && j < trainers.length){
            if (players[i] <= trainers[j]) i++;
            j++;
        }
        return i;
    }
}