/*
 * Submission: 1604429492
 * Problem: Find the Difference of Two Arrays (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-12 10:49:31 UTC
 * Runtime: N/A
 * Memory: N/A
 */


class Solution {
    public List<List<Integer>> findDifference(List<Integer> nums1, List<Integer> nums2) {
        // Create two sets to store the unique elements from both lists
        Set<Integer> set1 = new HashSet<>(nums1);
        Set<Integer> set2 = new HashSet<>(nums2);
        
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
