/*
 * Submission: 1736873417
 * Problem: Sort Integers by The Number of 1 Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 05:54:13 UTC
 * Runtime: 3 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] sortByBits(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    private void mergeSort(int[] arr,int l, int r){
        if (l == r) return;
        int mid = (r-l)/2 + l;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        return;
    }

    private void merge(int[] arr, int l, int mid, int r){
        int lSize = mid - l + 1;
        int rSize = r - mid;
        int rPointer = mid + 1, lPointer = l,  nPointer = l;
        int[] lArr = new int[lSize], rArr = new int[rSize];
        for (int i = 0; i < lSize; i++){
            lArr[i] = arr[lPointer++];
        }
        for (int i = 0; i < rSize; i++){
            rArr[i] = arr[rPointer++];
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(lArr));
        // System.out.println(Arrays.toString(rArr));
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        // System.out.println();
        lPointer = 0;
        rPointer = 0;
        while( lPointer < lSize && rPointer < rSize){
            int leftY = lArr[lPointer], leftC = bitC(leftY);
            int rightY = rArr[rPointer], rightC = bitC(rightY);
            if(leftC < rightC){
                arr[nPointer] = leftY;
                lPointer++;
            } else if (leftC == rightC && leftY < rightY) {
                arr[nPointer] = leftY;
                lPointer++;
            } else {
                arr[nPointer] = rightY;
                rPointer++;
            }
            nPointer++;
        }
        while( lPointer < lSize ){
            arr[nPointer] = lArr[lPointer];
            lPointer++;
            nPointer++;
        }
        while( rPointer < rSize ){
            arr[nPointer] = rArr[rPointer];
            rPointer++;
            nPointer++;
        }
        return;
    }

    private int bitC(int n){
        int c = 0;
        while( n > 0 ) {
            n &= (n-1);
            c++;
        }
        return c;    
        }
}