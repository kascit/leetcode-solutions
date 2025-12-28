/*
 * Submission: 1711178675
 * Problem: Final Array State After K Multiplication Operations I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 15:49:44 UTC
 * Runtime: 3 ms
 * Memory: 45 MB
 */

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pd = new PriorityQueue<>((a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        for(int i = 0; i < nums.length; i++){
            pd.offer(new int[]{nums[i],i});
        }
        while(k-->0){
            int[] c = pd.poll();
            int n = multiplier*c[0];
            nums[c[1]] = n;
            pd.offer(new int[]{n,c[1]});

        }
        
        return nums;
    }
}