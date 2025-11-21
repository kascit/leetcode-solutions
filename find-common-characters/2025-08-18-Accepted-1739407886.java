/*
 * Submission: 1739407886
 * Problem: Find Common Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 08:51:57 UTC
 * Runtime: 3 ms
 * Memory: 43.1 MB
 */

class Solution {
    public List<String> commonChars(String[] words) {
        int len = words[0].length();
        int[] freqA = new int[26];
        // int[] freqB = new int[26];
        int[] ans = new int[26];
        int flag = 0;
        Arrays.fill(ans, 150);
        for(int i = 0; i < words.length; i++){
            for (char cur : words[i].toCharArray()){
                // if (flag%2 == 0) 
                freqA[cur-'a']++;
                // else freqB[cur-'a']++;
            }
            for (int it = 0; it < 26; it++){
                //System.out.println(freqA[it] +"   "+ freqB[it]);
                ans[it] = Math.min(freqA[it],ans[it]);
            }
            Arrays.fill(freqA, 0);
            

            // if (flag >= 1) {
                // if (flag%2 == 1) 
                // else Arrays.fill(freqB, 0);
            // }
            // flag++;
        }


        List<String> ret = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while(ans[i] > 0){
                ret.add( String.valueOf((char)(i+'a')) );
                ans[i]--;
            }
        }
        return ret;
        // List<Character> ans = new ArrayList<>();
        // for(char i : b){
        //     ans.add(i);
        // }
        // for(char i : a){
        //     ans.add(i);
        // } 
        // Collections.sort(ans);
        // for (char as : ans){
        //     System.out.println(as);
        // }
        // return null;
        
    }
}
