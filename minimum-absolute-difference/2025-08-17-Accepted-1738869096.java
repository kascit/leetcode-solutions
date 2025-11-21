/*
 * Submission: 1738869096
 * Problem: Minimum Absolute Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:27:06 UTC
 * Runtime: 18 ms
 * Memory: 57.1 MB
 */

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE, len = arr.length;
        for (int i = 0; i < len - 1; i++){
            mindiff = Math.min(mindiff,arr[i+1]-arr[i]);
        }
        for (int i = 0; i < len - 1; i++){
            int first = arr[i+1];
            int second = arr[i];
            if (first - second == mindiff){
                ans.add(List.of(second,first));
            }
        }
        return ans;

    }
}