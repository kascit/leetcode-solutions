/*
 * Submission: 1735805632
 * Problem: Baseball Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 07:31:19 UTC
 * Runtime: 2 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String ch : operations){
                if (ch.equals("D")){
                    s.push(s.peek()*2);
                } else if (ch.equals("C")){
                    s.pop();
                } else if (ch.equals("+")){
                    int last = s.pop();
                    int pu = s.peek() + last;
                    s.push(last);
                    s.push(pu);
                } else s.push(Integer.parseInt(ch));

            // System.out.println(s);
        }
        int ans = 0;
        while(!s.isEmpty()){
            ans += s.pop();
        } return ans;
    }
}