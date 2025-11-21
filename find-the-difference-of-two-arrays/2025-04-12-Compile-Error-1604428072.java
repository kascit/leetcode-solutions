/*
 * Submission: 1604428072
 * Problem: Find the Difference of Two Arrays (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-12 10:47:31 UTC
 * Runtime: N/A
 * Memory: N/A
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(List<Integer> nums1, List<Integer> nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> sec = new ArrayList<>();
        
        for (int i = 0; i < 1e4; i++) {
            nums1.add(0);
            nums2.add(0);
        }

        for (int i = 0; i < nums1.size(); i++) {
            nums1.set(nums1.get(i) + 2001, 1);
        }

        for (int i = 0; i < nums2.size(); i++) {
            nums2.set(nums2.get(i) + 2001, 1);
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(nums1.get(i) + 2001) == 1 && nums2.get(nums1.get(i) + 2001) != 1) {
                first.add(nums1.get(i));
                nums1.set(nums1.get(i) + 2001, -1);
            }
        }

        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(nums2.get(i) + 2001) == 1 && nums1.get(nums2.get(i) + 2001) != 1) {
                sec.add(nums2.get(i));
                nums2.set(nums2.get(i) + 2001, -1);
            }
        }

        result.add(first);
        result.add(sec);
        return result;
    }
}
