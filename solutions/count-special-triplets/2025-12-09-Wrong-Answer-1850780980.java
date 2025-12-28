/*
Submission: 1850780980
Status: Wrong Answer
Timestamp: 2025-12-09 05:59:36 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int specialTriplets(int[] nums) {
        Map<Integer,Integer> pref = new HashMap<>();
        Map<Integer,Integer> suf = new HashMap<>();
        for (int n : nums) suf.merge(n,1,Integer::sum);
        for(Map.Entry<Integer,Integer> e : suf.entrySet()) {
          // System.out.println(e.getKey() +" " + e.getValue());
        }
        long ans = 0;
        for (int n : nums) {
          suf.merge(n,-1,Integer::sum);
          ans += Math.min(pref.getOrDefault(n*2,0),suf.getOrDefault(n*2,0));
          pref.merge(n,1,Integer::sum);
        }
        return (int) (ans % ((int) 1e9 + 7) );
    }
}