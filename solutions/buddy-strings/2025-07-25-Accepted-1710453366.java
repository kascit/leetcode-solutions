/*
 * Submission: 1710453366
 * Problem: Buddy Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 04:21:12 UTC
 * Runtime: 4 ms
 * Memory: 42.6 MB
 */

// class Solution {
//     public boolean buddyStrings(String s, String goal) {
//         int s1 = s.length(), s2 = goal.length();
//         if (s1 != s2) return false;
//         boolean first = true;
//         char fii = 0, scc = 0;
//         for(int i = 0; i < s1; i++){
//             char fi = s.charAt(i);
//             char sc = goal.charAt(i);
//             System.out.println(fi +"" + sc + "" + fii + "" + scc);
//             if(fi == sc){
//                 i++;
//             }
//             else {
//                 if (first){
//                     System.out.println("first" + fi +"" + sc + "" + fii + "" + scc);
//                     fii = fi;
//                     scc = sc;
//                     first = !first;
//                 } else {
//                     System.out.println("return" + fi +"" + sc + "" + fii + "" + scc);
//                     return fii == sc && scc == fi;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean buddyStrings(String s1, String s2) {
        Set<Integer> check = new HashSet<>();
        int n=s1.length();
        int m=s2.length();
        if(n!=m) return false;
        int first=-1;
        int second=-1;
        int count = 0, prev = 0;
        

        for(int i=0;i<n;i++)
        {
            int cur = s1.charAt(i);
            if(cur!=s2.charAt(i))
            {
                if(first==-1) first=i;
                else if(second==-1) second=i;
                else if(first!=-1 && second!=-1) return false;
            } 

            check.add(cur);
            
        }

        //System.out.println(count + "" + second);

        if(first == -1 && check.size() < s1.length() ) return true;
        if(second == -1) return false;

        if(s1.charAt(first)==s2.charAt(second) && s2.charAt(first)==s1.charAt(second))
        return true;

        return false;
        
    }
}