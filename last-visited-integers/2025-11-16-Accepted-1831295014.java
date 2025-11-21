/*
 * Submission: 1831295014
 * Problem: Last Visited Integers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:06:35 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        
        int k = 0;  

        for (int x : nums) {

            if (x == -1) {
                k++;

                
                if (k <= seen.size()) ans.add(seen.get(k - 1));
                else ans.add(-1);

            } else {
                
                k = 0;

               
                seen.add(0, x);
            }
        }
        return ans;
    }
}
