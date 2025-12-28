/*
 * Submission: 1731409294
 * Problem: Snake in Matrix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 15:48:02 UTC
 * Runtime: 2 ms
 * Memory: 44.3 MB
 */

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;
        for(String cmd : commands){
            switch(cmd){
                case "DOWN" -> ans+=n;
                case "RIGHT" -> ans+=1;
                case "LEFT" -> ans-=1;
                case "UP" -> ans-=n;
            }
        } return ans;
    }
}