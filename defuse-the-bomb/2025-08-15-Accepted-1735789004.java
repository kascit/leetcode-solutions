/*
 * Submission: 1735789004
 * Problem: Defuse the Bomb (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 07:15:22 UTC
 * Runtime: 4 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ksum = new int[len];
        boolean isNeg = false;
        if(k < 0) {
            k *= -1;
            isNeg = true;
            }
        for(int i = 0; i< len; i++){
            int sum = 0;
            for(int j = i + 1; j < k + i + 1; j++){
                sum += code[j%len];
            }
            ksum[i] = sum;
        }
        System.out.println(Arrays.toString(ksum));
        if (isNeg){
            if(k == len - 1){
                return ksum;
            }
            int idx = len - (k + 1);
            reverse(ksum,0,idx);
            reverse(ksum,idx,len);
            reverse(ksum,0,len);

        }
        return ksum;
    }

    private void reverse(int[] arr, int l, int r){
        while (l < --r){
            int TEMP = arr[l];
            arr[l] = arr[r];
            arr[r] = TEMP;
            l++;
        }
        return;
    }
}