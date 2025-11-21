/*
 * Submission: 1738815561
 * Problem: Set Mismatch (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:41:32 UTC
 * Runtime: 9 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        // int len = nums.length, realX = 0, expcX = 0, it = 1, sum = 0;
        // for (int n : nums){
        //     realX ^= n;
        //     expcX ^= it++;
        //     sum += n;
        // }

        // int miss = realX ^ expcX;

        // int diff = (len*(len+1))/2 - sum;
        // boolean opp = false;
        // if (diff < 0) {diff *= -1; opp = true;}
        // for (int i = 1; i <= len - diff; i++){
        //     if (((i ^ (i+diff)) == miss)) {
        //         if (!opp) return new int[]{i,i+diff};
        //         else return new int[]{i+diff,i};
        //     }
        // }

        Set<Integer> has = new HashSet<>();
        int sum = 0;
        for (int n : nums){
            has.add(n);
            sum += n;
        }

        int len = nums.length, miss = 0;
        for (int i = 1; i <= len; i++){
            if (!has.contains(i)) {
                miss = i;
                break;
            }
        }

        int diff = (len*(len+1))/2 - sum;

        return new int[] {miss-diff,miss};

    }
}

// 1 2 2 4
// 1 2 3 4

// 2 ^ 3

