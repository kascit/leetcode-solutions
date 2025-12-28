/*
 * Submission: 1735235827
 * Problem: Destination City (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 17:47:17 UTC
 * Runtime: 2 ms
 * Memory: 43.5 MB
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List<String> ent : paths){
            map.put(ent.get(0),ent.get(1));
        }
        String cur = paths.get(0).get(0);
        String next = map.get(cur);
        while( next != null){
            cur = next;
            next = map.get(cur);
        } return cur;
    }
}