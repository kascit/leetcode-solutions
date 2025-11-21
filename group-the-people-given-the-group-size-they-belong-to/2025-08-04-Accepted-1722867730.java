/*
 * Submission: 1722867730
 * Problem: Group the People Given the Group Size They Belong To (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 09:30:29 UTC
 * Runtime: 5 ms
 * Memory: 45.7 MB
 */

class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int len = groupSizes.length;
        boolean[] taken = new boolean[len];
        for (int i = 0; i < len; i++){
            int next = i;
            if (taken[i] == true) continue;
            List<Integer> cur = new ArrayList<>();
            int curSize = groupSizes[i];
            int j = i ;
            while(cur.size() < curSize){
                if (!taken[j] && groupSizes[j] == curSize){
                    cur.add(j);
                    taken[j] = true;
                }
                j++;
            }
            ans.add(new ArrayList<>(cur));
            //System.out.println(cur);
            //System.out.println(Arrays.toString(taken));

            cur.clear();
        }
        return ans;
    }
}