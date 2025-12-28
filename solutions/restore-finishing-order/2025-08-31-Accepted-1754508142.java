/*
 * Submission: 1754508142
 * Problem: Restore Finishing Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 08:00:35 UTC
 * Runtime: 1 ms
 * Memory: 45.2 MB
 */

class Solution {
    static int[] index = new int[101];
    public static int[] recoverOrder(int[] arr2, int[] arr1) {
        // Arrays.fill(index,1000);
        for (int i = 0; i < arr2.length; i++) {
            index[arr2[i]] = i;
        }
        mergeSort(arr1);
        return arr1;

    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (index[L[i]] < index[R[j]]) {
                arr[k++] = L[i++];
            } else if (index[L[i]] == index[R[j]]) {
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
                }
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}