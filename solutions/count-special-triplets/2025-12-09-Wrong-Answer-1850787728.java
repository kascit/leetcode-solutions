/*
Submission: 1850787728
Status: Wrong Answer
Timestamp: 2025-12-09 06:07:13 UTC
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
            ans += Math.max(pref.getOrDefault(n*2,0),suf.getOrDefault(n*2,0));
            // System.out.println(i+" " + " ans: " + ans + " n: " + nums[i]);
            }
          pref.merge(n,1,Integer::sum);
        }
        return (int) (ans % ((int) 1e9 + 7) );
    }
}