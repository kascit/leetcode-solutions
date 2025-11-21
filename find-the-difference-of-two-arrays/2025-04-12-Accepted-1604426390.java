/*
 * Submission: 1604426390
 * Problem: Find the Difference of Two Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 10:45:06 UTC
 * Runtime: 9 ms
 * Memory: 45.7 MB
 */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        for(int ele : nums1){
            s1.add(ele);   
        }
        for(int ele : nums2){
           s2.add(ele);
        }
        
        
        List<Integer> lst1 = new ArrayList<>(s1);
        List<Integer> lst2 = new ArrayList<>(s2);
        lst1.removeAll(s2);
        lst2.removeAll(s1);
        return Arrays.asList(lst1,lst2);
    }
}