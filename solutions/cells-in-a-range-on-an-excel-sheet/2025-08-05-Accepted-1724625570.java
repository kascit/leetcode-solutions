/*
 * Submission: 1724625570
 * Problem: Cells in a Range on an Excel Sheet (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:27:56 UTC
 * Runtime: 5 ms
 * Memory: 45.6 MB
 */

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char startC = s.charAt(0), endC = s.charAt(3), startR = s.charAt(1), endR = s.charAt(4), startRr = startR;
        // System.out.println(cstartC+""+startR+endC+endR);
        while(startC <= endC){
            startR = startRr;
            while(startR <= endR){
                ans.add(""+startC+startR);
                startR++;
            }
            startC++;
        }
        return ans;
    }
}