/*
 * Submission: 1757957130
 * Problem: Minimum Adjacent Swaps to Reach the Kth Smallest Number (Medium)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-09-03 07:43:07 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int getMinSwaps(String num, int k) {
        StringBuilder sb = new StringBuilder(num);
        int len = sb.length();
        while(k-->0){
            num = nextPermutation(num);
        }
        while(!sb.toString().equals(num)) {
            for (int i = len - 1; i >= 1; i--) {
                if ( Integer.parseInt(String.valueOf(sb.charAt(i-1))) < Integer.parseInt(String.valueOf(sb.charAt(i))) ) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i-1));
                    sb.setCharAt(i-1, temp);
                    break;
                }
            }
            k++;
        }
        // System.out.println(Long.parseLong(sb.toString()));
        return k+1;
    }
    public String nextPermutation(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = n - 2;

        // Step 1: find pivot
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: find rightmost successor greater than pivot
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        // Step 3: reverse suffix
        reverse(arr, i + 1, n - 1);

        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }
}