/*
 * Submission: 1735224671
 * Problem: Number of Common Factors (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 17:37:46 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int commonFactors(int a, int b) {
        int c = 1, i = 3, incr = 2;
        boolean bothEven = (((a&1) == 0) && ((b&1) == 0));
        if (bothEven){
            i = 2;
            incr = 1;
        }
        int min = (a > b) ? b : a;
        for(int it = i; it <= min; it+=incr){
            // System.out.println(it);
            if(a%it == 0 && b%it == 0) c++;
        } return c;
    }
}