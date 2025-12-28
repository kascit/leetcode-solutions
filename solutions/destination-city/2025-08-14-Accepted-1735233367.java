/*
 * Submission: 1735233367
 * Problem: Destination City (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 17:45:08 UTC
 * Runtime: 3 ms
 * Memory: 43.7 MB
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List<String> ent : paths){
            map.put(ent.get(0),ent.get(1));
        }
        String cur = paths.get(0).get(0);
        while(map.get(cur) != null){
            cur = map.get(cur);
        } return cur;
    }
}