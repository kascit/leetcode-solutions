/*
 * Submission: 1605689706
 * Problem: Unique Number of Occurrences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:33:39 UTC
 * Runtime: 2 ms
 * Memory: 42.2 MB
 */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> count = new HashSet<>();
        int[] ele = new int[2001];
        for (int i = 0; i < arr.length; i++ ){
            ele[arr[i]+1000]++;
        }
        for(int i = 0; i < ele.length; i++){
            if (ele[i] == 0) continue;
            if (count.contains(ele[i])) return false;
            count.add(ele[i]);
        }
        return true;
    }
}