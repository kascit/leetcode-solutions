/*
 * Submission: 1733963128
 * Problem: Separate the Digits in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 16:24:41 UTC
 * Runtime: 5 ms
 * Memory: 44.7 MB
 */

class Solution {
    private List<Integer> ans = new ArrayList<>();
    public int[] separateDigits(int[] nums) {
        for(int num : nums){
            doit(num);
            // Collections.reverse(ans.subList(start, end));
            // start = end;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private void doit(int n){
        if (n <= 0) return;
        doit(n/10);
        ans.add(n%10);
        return;
    }
}