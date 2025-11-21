/*
 * Submission: 1693954051
 * Problem: Find the Winning Player in Coin Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-11 06:29:45 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String winningPlayer(int x, int y) {
        int cnt = 0;
        while(x>=1 && y>=4){
            x--;
            y-=4;
            cnt++;
        }
        if((cnt&1) == 1) return "Alice"; else return "Bob";
    }
}