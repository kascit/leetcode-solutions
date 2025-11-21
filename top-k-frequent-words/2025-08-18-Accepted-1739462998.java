/*
 * Submission: 1739462998
 * Problem: Top K Frequent Words (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:56:32 UTC
 * Runtime: 8 ms
 * Memory: 44.9 MB
 */

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mp = new HashMap<>();
        List<String> ans = new ArrayList<>();
        // Arrays.sort(words);
        // int max = 0;
        for (String word : words ) {
            mp.merge(word,1,Integer::sum);
            // int count = mp.getOrDefault(word,0);
            // mp.put(word,++count);
            // max = (max > count) ? max : count;
            if (!ans.contains(word)) ans.add(word);
        }
        // for(Map.Entry<String,Integer> e : mp.entrySet()){
        //     if (e.getValue() == max) ans.add(e.getKey());
        // }
        Collections.sort(ans, (a, b) -> {
            int cmp = Integer.compare(mp.get(b), mp.get(a)); 
            if (cmp != 0) return cmp;
            return a.compareTo(b); 
        });

        return ans.subList(0,0+k);

    }
}