/*
 * Submission: 1740961630
 * Problem: Backspace String Compare (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-19 14:46:11 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         int slen = s.length();
//         int tlen = t.length();
//         int l = slen-1, r = tlen-1;
//         int sH = 0, tH = 0;
//         // boolean fuckl = false, fuckr = false;
//         boolean lEmpty = false, rEmpty = false;
//         while (l>=0 || r>=0) {
//             System.out.println((l) +"   " + (r));
//             if (l >= 0)System.out.print(s.charAt(l) +"   ");
//             if (r >= 0)System.out.println(t.charAt(r));
//             System.out.println((sH) +"   " + (tH));
//             System.out.println();


//             if (l >= 0 && s.charAt(l) == '#'){
//                 l--;
//                 sH++;
//                 // fuckl = true;
//                 continue;
//             } 
//             if (l >= 0 && sH > 0){
//                 // if (fuckl){
//                 //     if (sH > 1) l++;
//                 //     fuckl = false;
//                 // }
//                 sH--;
//                 l--;
//                 continue;
//             }
//             if (r >= 0 && t.charAt(r) == '#'){
//                 r--;
//                 tH++;
//                 // fuckr = true;
//                 continue;
//             } 
//             if (r >= 0 && tH > 0){
//                 // if (fuckr){
//                 //     if (tH > 1) r++;
//                 //     fuckr = false;
//                 // }
//                 tH--;
//                 r--;
//                 continue;
//             }
//             // System.out.println("# count" + tH +"   "+sH);
//             if (l >= 0 && r >= 0 && t.charAt(r) != s.charAt(l)) {
//                 return false;
//             }
//             if (lEmpty || rEmpty) {
//                 return l == r;
//             }


//             // if (l >= 0 && r >= 0 && t.charAt(r) == s.charAt(l)){
//             //     l--;
//             //     r--;
//             // }
//             if (l > 0) l--;
//             else lEmpty = true;
//             if (r > 0) r--;
//             else rEmpty = true;



//             // if (l<=0 && r<=0){
//             //     return l == r;
//             // }

//             // System.out.println((l) +"   " + (r));
//             // if (l >= 0)System.out.print(s.charAt(l) +"   ");
//             // if (r >= 0)System.out.println(t.charAt(r));
        
//         }
//         System.out.println((l) +"   " + (r));
//         System.out.println("here");
//         return l == r;
//     }
// }


class Solution {
    public boolean backspaceCompare(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int l = slen-1, r = tlen-1;
        int sH = 0, tH = 0;
        while (l>=0 || r>=0) {
            // System.out.println((l) +"   " + (r));
            // if (l >= 0)System.out.print(s.charAt(l) +"   ");
            // if (r >= 0)System.out.println(t.charAt(r));
            // System.out.println((sH) +"   " + (tH));
            // System.out.println();


            if (l >= 0 && s.charAt(l) == '#'){
                l--;
                sH++;
                continue;
            } 
            if (l >= 0 && sH > 0){
                sH--;
                l--;
                continue;
            }
            if (r >= 0 && t.charAt(r) == '#'){
                r--;
                tH++;
                continue;
            } 
            if (r >= 0 && tH > 0){
                tH--;
                r--;
                continue;
            }
            // System.out.println("# count" + tH +"   "+sH);
            if (l >= 0 && r >= 0 && t.charAt(r) != s.charAt(l)) {
                return false;
            }
            if (l < 0 || r < 0) {
                return l < 0 && r < 0;
            }


            if (l >= 0) l--;
            if (r >= 0) r--;

            // System.out.println((l) +"   " + (r));
            // if (l >= 0)System.out.print(s.charAt(l) +"   ");
            // if (r >= 0)System.out.println(t.charAt(r));
        
        }
        // System.out.println((l) +"   " + (r));
        // System.out.println("here");
        return l == r;
    }
}