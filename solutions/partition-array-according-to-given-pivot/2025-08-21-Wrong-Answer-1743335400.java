/*
 * Submission: 1743335400
 * Problem: Partition Array According to Given Pivot (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-21 15:05:33 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int less = 0, equal = 0, more = len - 1, index = (int) 1e7;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) nums[i] += (i+1)*(index);
            else nums[i] += (i+1)*(-index);
        }
        while (equal <= more) {
            int TEMP = 0;
            int cur = nums[equal]%(index);
            if (cur < pivot) {
                TEMP = nums[less];
                nums[less] = nums[equal];
                nums[equal] = TEMP;
                less++;
                equal++;
            } else if (cur == pivot) {
                equal++;

            } else {
                TEMP = nums[more];
                nums[more] = nums[equal];
                nums[equal] = TEMP;
                more--;
            }
            // System.out.println(Arrays.toString(nums));
        }
        Arrays.sort(nums,equal,len);
        for (int i = 0; i < len; i++) nums[i] = nums[i]%(index);
        return nums;
    }
}