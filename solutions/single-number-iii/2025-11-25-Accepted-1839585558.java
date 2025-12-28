/*
Submission: 1839585558
Status: Accepted
Timestamp: 2025-11-25 16:55:29 UTC
Runtime: 1 ms
Memory: 47.9 MB
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums) xor ^= n;
        int check = xor&-xor;
        int a = 0, b = 0;
        for (int n : nums){
            if ((check&n) == check) {
                a ^= n;
            } else b ^= n;
        } return new int[]{a,b};
    }
}