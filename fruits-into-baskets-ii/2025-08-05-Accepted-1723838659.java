/*
 * Submission: 1723838659
 * Problem: Fruits Into Baskets II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 04:09:28 UTC
 * Runtime: 2 ms
 * Memory: 44.3 MB
 */

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int len = baskets.length, c = 0;
        boolean[] occupied = new boolean[len];
        for(int fruit : fruits){
            
            int i = 0;
            while(i < len && (occupied[i] == true || baskets[i] < fruit)){
                i++;
            }
            if (i < len){
                occupied[i] = true;
                c++;                
            }
            //System.out.println(fruit+" "+Arrays.toString(occupied));

        } return len - c;
    }
}