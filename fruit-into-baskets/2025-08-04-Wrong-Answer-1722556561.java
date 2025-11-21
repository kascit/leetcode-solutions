/*
 * Submission: 1722556561
 * Problem: Fruit Into Baskets (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-04 04:03:17 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int totalFruit(int[] fruits) {
        Set<Integer> type = new HashSet<>();
        int i = 0, j = 0, len = fruits.length, ans = 0;
        while(j < len){
            while(j < len && type.size() <= 2){
                type.add(fruits[j++]);
            }
            while(i < j && type.size() > 2){
                type.remove(fruits[i++]);
            }
            ans = (ans > j - i) ? ans : j - i;
            
            
        } return ans;
    }
}