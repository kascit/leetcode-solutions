/*
 * Submission: 1735935978
 * Problem: Generate a String With Characters That Have Odd Counts (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 09:51:27 UTC
 * Runtime: 1 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while(n>i){
            char put = 'a';
            while(n>i && put < 'y'){
                int t = i;
                while(t-->0){
                    sb.append(put);
                    n--;
                    }
                put++;
                // System.out.println(n+"     "+i);
            }
            if(i == 1) i++; else
            i+=2;


        } 
        if((n&1) == 1){
            while(n-->0) sb.append("z");
            return sb.toString();
        }
        while(n-->1) sb.append("y");
        // System.out.println(sb.length());
        return sb.append("z").toString();
    }
}