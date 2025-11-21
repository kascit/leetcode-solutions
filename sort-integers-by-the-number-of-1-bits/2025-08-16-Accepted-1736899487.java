/*
 * Submission: 1736899487
 * Problem: Sort Integers by The Number of 1 Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 06:19:43 UTC
 * Runtime: 4 ms
 * Memory: 45.1 MB
 */

class Solution {
    private int[] aux;
    private static int[] bitCs = new int[10001];
    static {
        for(int i = 0; i < 10001; i++){
            bitCs[i] = Integer.bitCount(i);
        }
    }
    public int[] sortByBits(int[] arr) {
        // System.out.println(Arrays.toString(bitCs));
        int len = arr.length;
        aux = new int[len];
        // bitCs = new int[len];
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
        // int[] lArr = new int[lSize], rArr = new int[rSize];
        for (int i = lPointer; i < rPointer; i++){
            // lArr[i] = arr[lPointer++];
            aux[i] = arr[i];
        }
        for (int i = rPointer; i <= r; i++){
            // rArr[i] = arr[rPointer++];
            aux[i] = arr[i];
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(lArr));
        // System.out.println(Arrays.toString(rArr));
        // System.out.println(Arrays.toString(aux));
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        // System.out.println();
        lPointer = l;
        rPointer = mid+1;
        while( lPointer < mid + 1 && rPointer <= r){
            int leftY = aux[lPointer];// leftC = aux(leftY);
            int rightY = aux[rPointer];// rightC = aux(rightY);
            // if(leftC < rightC){
            if(bitCs[leftY] < bitCs[rightY]){
                arr[nPointer] = leftY;
                lPointer++;
            // } else if (leftC == rightC && leftY < rightY) {
            } else if (bitCs[leftY] == bitCs[rightY] && leftY < rightY) {
                arr[nPointer] = leftY;
                lPointer++;
            } else {
                arr[nPointer] = rightY;
                rPointer++;
            }
            nPointer++;
        }
        while( lPointer < mid + 1 ){
            arr[nPointer] = aux[lPointer];
            lPointer++;
            nPointer++;
        }
        while( rPointer <= r ){
            arr[nPointer] = aux[rPointer];
            rPointer++;
            nPointer++;
        }
        return;
    }

    // private int bitC(int n){
    //     int c = 0;
    //     while( n > 0 ) {
    //         n &= (n-1);
    //         c++;
    //     }
    //     return c;    
    //     }
}