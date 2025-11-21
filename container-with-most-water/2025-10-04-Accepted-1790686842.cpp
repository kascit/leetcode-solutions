/*
 * Submission: 1790686842
 * Problem: Container With Most Water (Medium)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-10-04 04:00:31 UTC
 * Runtime: 0 ms
 * Memory: 62.8 MB
 */

class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int left = 0,right = n-1;
        int lmax = height[0],rmax = height[n-1];
        int maxwater = 0;
        while(left<right){
            if(height[left] < rmax){
                maxwater = max(maxwater,(right - left)*(min(height[left],rmax)));
                left++;
                lmax=  max(lmax,height[left]);
            }
            else{
                maxwater = max(maxwater,(right - left)*(min(height[right],lmax)));
                right--;
                rmax= max(rmax,height[right]);
            }
        }
        return maxwater;
    }
};