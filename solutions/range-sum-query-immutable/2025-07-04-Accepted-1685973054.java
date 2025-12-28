/*
 * Submission: 1685973054
 * Problem: Range Sum Query - Immutable (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-04 09:15:49 UTC
 * Runtime: 55 ms
 * Memory: 49.5 MB
 */

class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum+= arr[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */