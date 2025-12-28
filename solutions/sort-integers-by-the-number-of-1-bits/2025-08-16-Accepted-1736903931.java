/*
 * Submission: 1736903931
 * Problem: Sort Integers by The Number of 1 Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 06:23:49 UTC
 * Runtime: 3 ms
 * Memory: 44.8 MB
 */

class Solution {
    private int[] aux;

    public int[] sortByBits(int[] arr) {
        aux = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        for (int i = l; i <= mid; i++) {
            aux[i] = arr[i]; // copy left half
        }

        int lPointer = l, rPointer = mid + 1, nPointer = l;

        while (lPointer <= mid && rPointer <= r) {
            int leftY = aux[lPointer];
            int rightY = arr[rPointer];
            int leftBits = bitC(leftY);
            int rightBits = bitC(rightY);

            if (leftBits < rightBits || (leftBits == rightBits && leftY <= rightY)) {
                arr[nPointer++] = leftY;
                lPointer++;
            } else {
                arr[nPointer++] = rightY;
                rPointer++;
            }
        }

        while (lPointer <= mid) {
            arr[nPointer++] = aux[lPointer++];
        }

        // remaining right half elements are already in place
    }

    private int bitC(int n) {
        int c = 0;
        while (n > 0) {
            n &= (n - 1);
            c++;
        }
        return c;
    }
}
