/*
 * Submission: 1685976648
 * Problem: Remove Duplicates from Sorted Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-04 09:19:44 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; 
    }
}
