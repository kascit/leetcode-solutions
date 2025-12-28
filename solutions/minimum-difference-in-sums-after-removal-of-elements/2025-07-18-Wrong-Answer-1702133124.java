/*
 * Submission: 1702133124
 * Problem: Minimum Difference in Sums After Removal of Elements (Hard)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 07:05:55 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public long minimumDifference(int[] nums) {
        PriorityQueue<Integer> mini = new PriorityQueue<>();
        PriorityQueue<Integer> maxi = new PriorityQueue<>(Collections.reverseOrder());

        int maxIt = 0, n = nums.length, minIt = n - 1, ans = Integer.MAX_VALUE, size = n/3 + 1, minSum = 0, maxSum = 0;

        while(minIt >= 0 && maxIt < n){
            while(minIt < n && mini.size() <= size){
                mini.offer(nums[minIt]);
                minSum += nums[minIt++];
            }
            while(maxIt >= 0 && maxi.size() <= size){
                maxi.offer(nums[maxIt]);
                maxSum += nums[maxIt++];
            }
            if ( maxi.size() == size && mini.size() == size ){
                maxSum -= maxi.poll();
                minSum -= mini.poll();
            }
            ans = Math.min(ans, maxSum - minSum);


        }
        
        return ans;


    }
}