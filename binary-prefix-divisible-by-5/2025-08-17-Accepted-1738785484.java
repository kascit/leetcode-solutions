/*
 * Submission: 1738785484
 * Problem: Binary Prefix Divisible By 5 (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:15:44 UTC
 * Runtime: 4 ms
 * Memory: 45.6 MB
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
            cur<<=1;
            cur|=nums[i];
            cur %= 10;
            if (cur == 0 || cur== 5) ans.add(true);
            else ans.add(false);
        } return ans;
    }
}
