/*
 * Submission: 1724627271
 * Problem: Cells in a Range on an Excel Sheet (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:29:13 UTC
 * Runtime: 1 ms
 * Memory: 45.2 MB
 */

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char startC = s.charAt(0), endC = s.charAt(3), startR = s.charAt(1), endR = s.charAt(4), startRr = startR;
        // System.out.println(cstartC+""+startR+endC+endR);
        while(startC <= endC){
            startR = startRr;
            while(startR <= endR){
                ans.add(new String(new char[] {startC,startR}));
                startR++;
            }
            startC++;
        }
        return ans;
    }
}