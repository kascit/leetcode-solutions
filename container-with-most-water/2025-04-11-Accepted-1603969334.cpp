/*
 * Submission: 1603969334
 * Problem: Container With Most Water (Medium)
 * Status: Accepted
 * Language: cpp
 * Timestamp: 2025-04-11 19:34:35 UTC
 * Runtime: 0 ms
 * Memory: 63 MB
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