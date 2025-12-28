/*
Submission: 1851847654
Status: Accepted
Timestamp: 2025-12-10 08:50:28 UTC
Runtime: 5 ms
Memory: 98.2 MB
*/

class Solution {
    public int countPermutations(int[] complexity) {
        int min = Integer.MAX_VALUE;
        // Set<Integer> set = new HashSet<>();
        for (int c : complexity) {
           // if (!set.add(c)) return 0;
            min = Math.min(min,c);
        }
        if (complexity[0] != min) return 0;

        int cnt = 0;
        for (int c : complexity) {
            if (c==min) cnt++;
            if (cnt > 1) return 0;
            //min = Math.min(min,c);
        }
        
        return (int) (fact(complexity.length-1));
    }

    long fact(int n) {
        if (n==1) return 1;
        return ( n*fact(n-1) % 1_000_000_007 );
    }
}