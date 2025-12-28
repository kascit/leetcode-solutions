/*
 * Submission: 1730328204
 * Problem: Kth Distinct String in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:33:25 UTC
 * Runtime: 7 ms
 * Memory: 44.3 MB
 */

class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> mp = new LinkedHashMap<>();
        for (String st : arr){
            mp.put(st,mp.getOrDefault(st,0)+1);
        }
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            if (e.getValue() == 1){
                k--;
                if (k==0) return e.getKey();
            }
        }
        return ""; 
    }
}