/*
Submission: 1864274305
Status: Accepted
Timestamp: 2025-12-24 15:00:20 UTC
Runtime: 19 ms
Memory: 56.7 MB
*/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
      int l = 0, r = people.length - 1, boats = 0;
        Arrays.sort(people);
        while(l <= r) {
          if (people[l] + people[r] <= limit) l++;
          r--;
          boats++;
        } return boats;
    }
}