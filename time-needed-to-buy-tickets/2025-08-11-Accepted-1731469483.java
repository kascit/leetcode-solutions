/*
 * Submission: 1731469483
 * Problem: Time Needed to Buy Tickets (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:35:47 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int totalTime = 0;
        int timeK = tickets[k];

        for(int i=0; i<tickets.length; i++){
            if(i<=k){
                totalTime += Math.min(tickets[i],timeK);
            }else{
                totalTime += Math.min(tickets[i], timeK-1);
            }
        }
        return totalTime;
    }
}