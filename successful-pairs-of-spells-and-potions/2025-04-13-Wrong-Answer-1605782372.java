/*
 * Submission: 1605782372
 * Problem: Successful Pairs of Spells and Potions (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-13 16:31:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        for (int i = 0; i < n; i++ ){
            int l = 0, r = potions.length - 1;
            while(l <= r){
                int mid = l + (r-l)/2;
                if (potions[mid]*spells[i] >= success){
                    r = mid - 1;
                } else {l = mid + 1;}
            }
            System.out.println("l: " + l);
            res[i] = potions.length - l;
        }
        return res;
    }
}