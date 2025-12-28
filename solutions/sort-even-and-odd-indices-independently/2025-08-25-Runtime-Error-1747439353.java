/*
 * Submission: 1747439353
 * Problem: Sort Even and Odd Indices Independently (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-25 07:07:56 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        int[] odds = new int[len/2];
        int[] evens = new int[len/2];
        int o = 0, e = 0;
        for (int i = 0; i < len; i++) {
            if (i%2 == 0) {
                evens[e++] = nums[i];
            } else odds[o++] = nums[i];
        }

        Arrays.sort(evens);
        mergeSort(odds,0,o-1);
        o = 0; e = 0;
        for (int i = 0; i < len; i++) {
            if (i%2 == 0) {
                nums[i] = evens[e++];
            } else nums[i] = odds[o++];
        } return nums;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {    
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}