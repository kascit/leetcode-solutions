/*
Submission: 1850789639
Status: Wrong Answer
Timestamp: 2025-12-09 06:09:20 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int specialTriplets(int[] nums) {
        Map<Integer,Integer> pref = new HashMap<>();
        Map<Integer,Integer> suf = new HashMap<>();
        for (int n : nums) suf.merge(n,1,Integer::sum);

        // for(Map.Entry<Integer,Integer> e : suf.entrySet()) {
        //   System.out.println(e.getKey() +" " + e.getValue());
        // }
        
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
          int n = nums[i];
          suf.merge(n,-1,Integer::sum);
          if (i != 0 && i != nums.length - 1) {
            int prev = pref.getOrDefault(n*2,0);
            int next = suf.getOrDefault(n*2,0);
            if (prev != 0 && next != 0) ans += Math.max(prev,next);
            // System.out.println(i+" " + " ans: " + ans + " n: " + nums[i]);
            }
          pref.merge(n,1,Integer::sum);
        }
        return (int) (ans % ((int) 1e9 + 7) );
    }
}