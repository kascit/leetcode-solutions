/*
 * Submission: 1759667977
 * Problem: Count Vowel Substrings of a String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-04 17:44:34 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    int[] freq = new int[5];
    String w;
    boolean hehe;
    public int countVowelSubstrings(String word) {
        hehe = false;
        this.w = word;
        String vowels = "aeiou";
        int l = 0, r = 0, len = word.length(), ans = 0;
        outer: while (l < len) {
            char ll = word.charAt(l);
            // System.out.println(l +"   "+r);
            while (vowels.indexOf(ll) == -1) {
            // System.out.println(l +"   "+r);
                l++;
                if (l == len) break outer;
                ll = word.charAt(l);
            } 
            r = l;
            // System.out.println(l +"   "+r);
            while(r < len && !check()) {
            // System.out.println(l +"   "+r);
                char rr = word.charAt(r);
                if (vowels.indexOf(rr) != -1) {
                    pompom(rr,1);
                } else {
            Arrays.fill(freq,0);
                    l=r;
                    continue outer;
                }
                r++;
            }
            r--;

            if (hehe) {
                // int t = r;
                while(r<len && vowels.indexOf(word.charAt(r)) != -1) {
            System.out.println(l +"   "+r);
            System.out.println(Arrays.toString(freq));
            
                    ans++;
                    r++;
                }
                // while(r++<len) ans++;
                // r = t;

                // System.out.println(l+"   "+r);
            }
            Arrays.fill(freq,0);
            hehe = false;
            // if (vowels.indexOf(ll) != -1) {
                // pompom(ll,-1);
            // }
            l++;
        } return ans;
    }

    private boolean check() {
        for(int i = 0; i < 5; i ++) {
            if (freq[i] < 1) return false;
        } return (hehe = true);
    }

    private void pompom(char ch, int dos) {
        // System.out.println("popo->" + ch);
        if (ch == 'a') freq[0] += dos;
        else if (ch == 'e') freq[1] += dos;
        else if (ch == 'i') freq[2] += dos;
        else if (ch == 'o') freq[3] += dos;
        else freq[4] += dos;
    }
}