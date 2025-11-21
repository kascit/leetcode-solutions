/*
 * Submission: 1758299496
 * Problem: Invalid Transactions (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 14:27:33 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> ans = new ArrayList<>();
        Map<String,String> ntoc = new HashMap<>();
        Map<String,Integer> ntot = new HashMap<>();
        Map<String,String> last = new HashMap<>();
        for (String t : transactions) {
            String[] deed = t.split(",");
            String name = deed[0];
            String city = deed[3];
            int time = Integer.parseInt(deed[1]);
            int amt = Integer.parseInt(deed[2]);
            if (amt > 1000) {
                ans.add(t);
                continue;
            }
            String prevCity = ntoc.get(name);
            if (prevCity != null && !city.equals(prevCity)) {
                int prevTime = ntot.getOrDefault(name,-1);
                if (prevTime != -1 && time - prevTime <= 60) {
                    ans.add(t);
                    String l = last.get(name);
                    if (l != null) {
                        ans.add(l);
                        // last.remove(name);
                    }
                }
            }
            ntoc.put(name,city);
            ntot.put(name,time);
            last.put(name,t);
        } 
        return ans;
    }
}