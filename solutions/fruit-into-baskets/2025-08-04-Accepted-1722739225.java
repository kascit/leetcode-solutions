/*
 * Submission: 1722739225
 * Problem: Fruit Into Baskets (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 07:07:14 UTC
 * Runtime: 50 ms
 * Memory: 57.7 MB
 */

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> type = new HashMap<>();
        int i = 0, j = 0, len = fruits.length, ans = 0;
        while(j < len){
            //System.out.println(i +" "+j);
            if (type.size() <= 2){
                type.put(fruits[j],type.getOrDefault(fruits[j],0)+1);
                
                if (type.size() <= 2){
                    ans = (ans > j - i + 1) ? ans : j - i + 1;
                }
                j++;
            } else {
                type.put(fruits[i],type.get(fruits[i])-1);
                if (type.get(fruits[i]) == 0)
                type.remove(fruits[i]);
                i++;
                
            }
    
            
        } return ans;
    }
}