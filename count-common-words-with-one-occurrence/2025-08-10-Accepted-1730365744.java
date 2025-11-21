/*
 * Submission: 1730365744
 * Problem: Count Common Words With One Occurrence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 17:06:45 UTC
 * Runtime: 6 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Boolean> mp = new HashMap<>();
        int k = 0;
        for (String w : words1){
            if (mp.containsKey(w)) mp.put(w,false);
            else mp.put(w,true);
        }
        mp.keySet().removeIf(key -> mp.get(key) == false);
        // for (Map.Entry<String, Boolean> entry : mp.entrySet()) {
        //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }
        for (String w : words2){
            if (mp.get(w) == null) continue;
            boolean exists = mp.get(w);
            if (exists){
                k++;
                mp.put(w,false);
            } else {
                k--;
                mp.remove(w);
            }
        } return k;
    }
}