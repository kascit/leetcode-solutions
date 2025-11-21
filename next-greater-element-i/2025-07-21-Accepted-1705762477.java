/*
 * Submission: 1705762477
 * Problem: Next Greater Element I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 09:50:59 UTC
 * Runtime: 2 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> nge = new Stack<>();
        int len = nums2.length;
        int[] ans = new int[10000];
        
        for (int i = len - 1; i >= 0; i--){
            int cur = -1;
            while (!nge.isEmpty() && nge.peek() < nums2[i]){
                nge.pop();
            }
            if(!nge.isEmpty()) cur = nge.peek();
            ans[nums2[i]] = cur;
            nge.push(nums2[i]);
        }
        //System.out.println(Arrays.toString(ans));
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            res[i] = ans[nums1[i]];
        }
        return res;
    }
}