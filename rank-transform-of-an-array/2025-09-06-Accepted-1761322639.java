/*
 * Submission: 1761322639
 * Problem: Rank Transform of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 09:43:45 UTC
 * Runtime: 29 ms
 * Memory: 62.6 MB
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> idk = new HashMap<>();
        int[] arrCopy = arr.clone();   
        Arrays.sort(arrCopy);  
        int it = 1;        
        for(int n : arrCopy) {
            if(!idk.containsKey(n)) {
                idk.put(n,it++);
            }
        }
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = idk.get(arr[i]);
        }
        return arr;

    }
}