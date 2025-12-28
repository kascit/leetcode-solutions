/*
 * Submission: 1716775605
 * Problem: Shuffle String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 07:22:17 UTC
 * Runtime: 0 ms
 * Memory: 44.8 MB
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]= new char[s.length()];
        for(int i =0; i<indices.length; i++){
            arr[indices[i]]=s.charAt(i);
        }
        String s1 = new String(arr);
        return s1;
    }
}