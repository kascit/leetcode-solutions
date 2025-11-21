/*
 * Submission: 1739442549
 * Problem: Sort Array by Increasing Frequency (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:32:55 UTC
 * Runtime: 1 ms
 * Memory: 43.7 MB
 */

class Solution {
    private int[] freq = new int[201];
    private int[] aux;
    public int[] frequencySort(int[] nums) {
        int len = nums.length;
        aux = new int[len];
        for(int i : nums){
            freq[i+100]++;
        }

        // for (int i = 0; i < freq.length; i++) {
        //     if (freq[i] != 0) {
        //         int value = i - 100;   // shift back to original number
        //         System.out.println(value + " -> " + freq[i]);
        //     }
        // }
        mergeSort(nums,0,len-1);
        return nums;
    }

    private void mergeSort(int[] arr, int l, int r){
        if (l >= r) return;
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr, int l, int mid, int r){
        int lSize = mid - l + 1;
        int rSize = r - mid;
        for(int i = l; i < mid + 1; i++){
            aux[i] = arr[i];
        }
        // System.out.println(l +"   " + r + Arrays.toString(aux));
        // System.out.println(Arrays.toString(arr));
        int lt = l, rt = mid+1, k = l;
        while(lt <= mid && rt <= r){
            if (freq[aux[lt] + 100] < freq[arr[rt] + 100]){
                arr[k] = aux[lt];
                lt++;
            } 
            else if (freq[aux[lt] + 100] == freq[arr[rt] + 100]) {
                if (aux[lt] > arr[rt]){
                    arr[k] = aux[lt];
                    lt++;
                } else {
                    arr[k] = arr[rt];
                    rt++;
                }
            } 
            else {
                arr[k] = arr[rt];
                rt++;
            }
            k++;
        }
        while(lt <= mid){
            arr[k] = aux[lt];
            lt++;
            k++;
        }
        while(rt <= r){
            arr[k] = arr[rt];
            rt++;
            k++;
        }
        return;
    }
}