/*
 * Submission: 1738787004
 * Problem: Binary Prefix Divisible By 5 (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:17:05 UTC
 * Runtime: 4 ms
 * Memory: 45.8 MB
 */

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int len = nums.length;
        int cur = 0;
        // int n = 5; // base number
        // int count = 10; // how many multiples

        // for (int i = 1; i <= count; i++) {
        //     int multiple = n * i;
        //     String binary = Integer.toBinaryString(multiple);
        //     System.out.println(multiple + " -> " + binary);
        // }
        for(int i = 0; i < len; i++){
            cur*=2;
            cur+=nums[i];
            cur %= 10;
            ans.add(cur == 0 || cur== 5);
        } return ans;
    }
}
