/*
Submission: 1864042143
Status: Accepted
Timestamp: 2025-12-24 09:06:21 UTC
Runtime: 4 ms
Memory: 44.5 MB
*/

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) sum += a;
        // System.out.println(sum);
        Arrays.sort(capacity);
        int r = capacity.length - 1;
        while(r>=0 && sum > 0){
            sum-=capacity[r--];
        } return capacity.length - r - 1;
    }
}