/*
 * Submission: 1719363716
 * Problem: Sort the People (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 10:01:48 UTC
 * Runtime: 10 ms
 * Memory: 45.5 MB
 */

class Solution {
    public String[] sortPeople(String[] names, int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++){
            int min = i;
            for (int j = i; j < len; j++){
                if (nums[j] > nums[min]){
                    min = j;
                }
            }
            if (min != i){
                nums[min] ^= nums[i];
                nums[i] ^= nums[min];
                nums[min] ^= nums[i];
                String TEMP = names[i];
                names[i] = names[min];
                names[min] = TEMP;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return names;
    }
}