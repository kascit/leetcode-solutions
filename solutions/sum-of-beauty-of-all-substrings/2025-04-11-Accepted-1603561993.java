/*
 * Submission: 1603561993
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:39:52 UTC
 * Runtime: 59 ms
 * Memory: 43 MB
 */

class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq=new int [26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                ans+=max-min;
            }
        }
        return ans;
    }
}