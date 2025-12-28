/*
Submission: 1851740762
Status: Wrong Answer
Timestamp: 2025-12-10 06:22:44 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int countPermutations(int[] complexity) {
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int c : complexity) {
           // if (!set.add(c)) return 0;
            min = Math.min(min,c);
        }
        if (complexity[0] != min) return 0;
        for (int c : complexity) {
            if (c==min && !set.add(c)) return 0;
            //min = Math.min(min,c);
        }
        
        return fact(complexity.length-1);
    }

    int fact(int n) {
        if (n==1) return 1;
        return n*fact(n-1);
    }
}