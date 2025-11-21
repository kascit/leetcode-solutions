/*
 * Submission: 1747442360
 * Problem: Sort Even and Odd Indices Independently (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 07:11:30 UTC
 * Runtime: 2 ms
 * Memory: 44.5 MB
 */

class Solution {
    public int[] sortEvenOdd(int[] nums) 
    {
        int n=nums.length,l1=n/2+1,t1=0,t2=0;

        int even[]=new int[l1];
        int odd[]=new int[l1];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
               even[t1++]=nums[i];
            else
              odd[t2++]=nums[i];
        }
        Arrays.sort(even,0,t1);
        Arrays.sort(odd,0,t2);
         t1=0;t2=n/2-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
              nums[i]=even[t1++];
            else
              nums[i]=odd[t2--];
        }
        return nums;
    }
}