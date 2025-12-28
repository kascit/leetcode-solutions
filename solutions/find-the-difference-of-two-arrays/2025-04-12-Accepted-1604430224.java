/*
 * Submission: 1604430224
 * Problem: Find the Difference of Two Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:50:37 UTC
 * Runtime: 10 ms
 * Memory: 45.4 MB
 */

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert int[] to List<Integer> for both arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Initialize lists to store the results
        List<Integer> first = new ArrayList<>();
        List<Integer> sec = new ArrayList<>();
        
        // Add elements from set1 that are not in set2
        for (int num : set1) {
            if (!set2.contains(num)) {
                first.add(num);
            }
        }
        
        // Add elements from set2 that are not in set1
        for (int num : set2) {
            if (!set1.contains(num)) {
                sec.add(num);
            }
        }

        // Return the result as a list of two lists
        List<List<Integer>> result = new ArrayList<>();
        result.add(first);
        result.add(sec);
        return result;
    }
}
