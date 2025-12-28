/*
 * Submission: 1758367843
 * Problem: Invalid Transactions (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 15:36:18 UTC
 * Runtime: 101 ms
 * Memory: 45.4 MB
 */

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> ans = new ArrayList<>();
        Map<String,List<String>> last = new HashMap<>();
        Map<String,Integer> done = new HashMap<>();
        for (String t : transactions) {
            done.merge(t,1,Integer::sum);
            String[] deed = t.split(",");
            String name = deed[0];
            String city = deed[3];
            int time = Integer.parseInt(deed[1]);
            int amt = Integer.parseInt(deed[2]);
            if (amt > 1000) {
                ans.add(t);
                done.merge(t,-1,Integer::sum);
            }
            List<String> prevT = last.get(name);
            boolean inv = false;
            if (prevT != null) {
                Iterator<String> it = prevT.iterator();
                while (it.hasNext()) {
                    String pt = it.next();
                    String[] peed = pt.split(",");
                    String prevCity = peed[3];
                    int prevAmt = Integer.parseInt(peed[2]);
                    int prevTime = Integer.parseInt(peed[1]);
                    if (!city.equals(prevCity) && Math.abs(time - prevTime) <= 60) {
                        // System.out.println(ans.toString());
                        // System.out.println(t);
                        // System.out.println(pt);
                        // System.out.println("city: " + city);
                        // System.out.println("prevCity: " + prevCity);
                        // System.out.println("time: " + time);
                        // System.out.println("prevTime: " + prevTime);
                        // System.out.println("city.equals(prevCity): " + city.equals(prevCity));
                        // System.out.println("time - prevTime: " + (time - prevTime));
                        // it.remove();
                        if (done.getOrDefault(pt,0) > 0) {
                            ans.add(pt);
                            done.merge(pt,-1,Integer::sum);
                            }
                        inv = true;
                    } 
                }
            }
            if (inv && done.getOrDefault(t,0) > 0) {
                ans.add(t);
                done.merge(t,-1,Integer::sum);
            }
            last.computeIfAbsent(name, k -> new ArrayList<>()).add(t);
        } 
        return ans;
    }
}


























        // Map<String,String> ntoc = new HashMap<>();
        // Map<String,Integer> ntot = new HashMap<>();
            // String prevCity = ntoc.get(name);
            // if (prevCity != null && !city.equals(prevCity)) {
            //     int prevTime = ntot.getOrDefault(name,-1);
            //     if (prevTime != -1 && time - prevTime <= 60) {
            //         ans.add(t);
            //         // String l = last.get(name);
            //         if (l != null) {
            //             ans.add(l);
            //             // last.remove(name);
            //         }
            //     }
            // }
            // ntoc.put(name,city);
            // ntot.put(name,time);
            // last.put(name,t);