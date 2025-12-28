/*
 * Submission: 1733960335
 * Problem: Separate the Digits in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 16:22:27 UTC
 * Runtime: 8 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int start = 0, end = 0;
        for(int num : nums){
            while (num > 0){
                ans.add(num%10);
                num /= 10;
                end++;
            }
            Collections.reverse(ans.subList(start, end));
            start = end;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}