/*
Submission: 1837877092
Status: Accepted
Timestamp: 2025-11-23 17:56:42 UTC
Runtime: 0 ms
Memory: 42 MB
*/

class Solution {
    public int twoEggDrop(int n) {
        int i = 1;
        while(true) {
            if ((i*(i+1))/2 >= n) return i;
            i++;
        }
    }
}