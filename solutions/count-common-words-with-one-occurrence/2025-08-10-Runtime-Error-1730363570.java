/*
 * Submission: 1730363570
 * Problem: Count Common Words With One Occurrence (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-10 17:04:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Boolean> mp = new HashMap<>();
        int k = 0;
        for (String w : words1){
            if (mp.containsKey(w)) mp.put(w,false);
            else mp.put(w,true);
        }
        for (Map.Entry<String, Boolean> entry : mp.entrySet()) {
            if(!entry.getValue()) mp.remove(entry.getKey());
        }
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